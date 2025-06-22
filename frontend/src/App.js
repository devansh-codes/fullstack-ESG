import React, { useState, useEffect } from 'react';
import axios from 'axios';
import './App.css';
import EsgChart from './components/EsgChart';

function App() {
    // --- CHANGE 1: State Initialization ---
    // Store health as a simple string.
    // Store esgData as an OBJECT, initialized to null. This is key.
    const [health, setHealth] = useState('');
    const [esgData, setEsgData] = useState(null); // Start with null
    const [gdpData, setGdpData] = useState(''); // Keep this as is for now

    useEffect(() => {
        // Fetch health status (no changes here)
        axios.get('/api/health')
            .then(response => setHealth(response.data))
            .catch(error => console.error('Error fetching backend health:', error));

        // Fetch World Bank data (no changes here)
        axios.get('/api/data/worldbank/gdp/us')
            .then(response => setGdpData(JSON.stringify(response.data, null, 2)))
            .catch(error => console.error('Error fetching GDP data:', error));

        // --- CHANGE 2: Data Fetching ---
        // Fetch ESG data and store the object directly. NO MORE JSON.stringify!
        axios.get('/api/data/refinitiv/esg/MSFT.O')
            .then(response => {
                setEsgData(response.data); // Store the actual object
            })
            .catch(error => {
                console.error('Error fetching ESG data:', error);
                setEsgData({ error: true }); // Set an error state if fetch fails
            });
    }, []); // The empty array ensures this runs only once.

    // --- CHANGE 3: Data Transformation ---
    // This function will only run when esgData is a valid object.
    const getChartData = () => {
        if (!esgData) return []; // Return empty array if data is not ready

        return [
            { name: 'Environment', score: esgData.environmentPillar || 0 },
            { name: 'Social', score: esgData.socialPillar || 0 },
            { name: 'Governance', score: esgData.governancePillar || 0 },
            { name: 'Overall ESG', score: esgData.esgScore || 0 },
        ];
    };

    return (
        <div className="App">
            <header className="App-header">
                <h1>ESGalpha Dashboard</h1>
                <p><strong>Backend Status:</strong> {health}</p>

                <div className="data-container">
                    <h2>World Bank GDP (US)</h2>
                    <pre>{gdpData}</pre>
                </div>

                <div className="data-container">
                    <h2>Refinitiv ESG (MSFT.O)</h2>
                    {/* --- CHANGE 4: Conditional Rendering --- */}
                    {/* This is the most important part. We only render the chart */}
                    {/* IF esgData has been successfully loaded. */}
                    {esgData ? (
                        <EsgChart data={getChartData()} />
                    ) : (
                        <div>Loading ESG Chart...</div>
                    )}
                </div>
            </header>
        </div>
    );
}

export default App;