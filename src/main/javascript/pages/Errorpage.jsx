import React from "react";
import { Link } from "react-router-dom";

const ErrorPage = () => (
    <div
        style={{
            display: "flex",
            flexDirection: "column",
            justifyContent: "center",
            alignItems: "center",
            marginTop: "20%",
        }}
    >
        <h1 style={{ marginBottom: "20px" }}>Page Not Found!</h1>
        <Link to="/">Go to Home Page</Link>
    </div>
);

export default ErrorPage;