import React, { useState, useEffect } from 'react';
import axios from 'axios';

export  function UserProfile() {
    const [user, setUser] = useState(null);
    const [loading, setLoading] = useState(false);
    const [error, setError] = useState('');

    useEffect(() => {
        setLoading(true);
        axios.get('/api/user/123')
            .then(response => setUser(response.data))
            .catch(error => setError('Error fetching user data'))
            .finally(() => setLoading(false));
    }, []);

return data;
}