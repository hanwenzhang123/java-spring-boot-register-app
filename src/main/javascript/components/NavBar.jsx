import React from "react";
const NavBar = () => {
    return (
        <nav className="navbar navbar-expand-lg navbar-light bg-light">
            <a className="navbar-brand" href="/">Course Registration App</a>
            <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText"
                    aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
                <span className="navbar-toggler-icon"></span>
            </button>
            <div className="collapse navbar-collapse" id="navbarText">
                <ul className="navbar-nav mr-auto">
                    <li className="nav-item active">
                        <a className="nav-link" href="/courses">All Courses</a>
                    </li>
                    <li className="nav-item">
                        <a className="nav-link" href="/faculties">All Faculties</a>
                    </li>
                    <li className="nav-item">
                        <a className="nav-link" href="/students">All Students</a>
                    </li>
                </ul>
                <span className="navbar-text">
                  Computer Science Department
                </span>
            </div>
        </nav>
    );
}

export default NavBar;