import { createContext } from 'react';

export const LOGIN = 'login';
export const LOGOUT = 'logout';

export const initialState = {
    result: false,
    username: 'guest'
};

export const reducer = (state, action) => {
    switch (action.type) {
        case LOGIN:
            return { ...state, username: action.username, result: true }
        case LOGOUT:
            return { ...state, result: false, username: 'guest' }
        default:
            return state;
    }
};

const UserContext = createContext();
export default UserContext;