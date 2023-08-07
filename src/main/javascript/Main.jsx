import React, { Component } from "react";
import ReactDOM from 'react-dom';
import { Route, Routes, BrowserRouter as Router } from "react-router-dom";
import './main.css';
import NavBar from "./components/NavBar"
import AllCoursesMainPage from "./pages/AllCoursesMainPage";
import AllFacultiesMainPage from "./pages/AllFacultiesMainPage";
import AllStudentsMainPage from "./pages/AllStudentsMainPage";
import WelcomePage from "./pages/WelcomePage";
import ErrorPage from "./pages/Errorpage";


class Main extends Component {
    render() {
        return (
            <Router>
                <NavBar />
                <Routes>
                    <Route
                        exact
                        path="/"
                        element={<WelcomePage />}
                    />
                    <Route
                        exact
                        path="/courses"
                        element={<AllCoursesMainPage />}
                    />
                    <Route
                        exact
                        path="/faculties"
                        element={<AllFacultiesMainPage />}
                    />
                    <Route
                        exact
                        path="/students"
                        element={<AllStudentsMainPage />}
                    />
                    <Route exact path="/error" element={<ErrorPage />} />
                    <Route path="/*" element={<ErrorPage />} />
                </Routes>
            </Router>
        );
    }
}

ReactDOM.render(
    <Main />,
    document.getElementById('react-app')
);