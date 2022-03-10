import { ReactComponent as GthubIcon} from 'assets/img/github.svg';
import { Link } from 'react-router-dom';
import './styles.css';

function Navbar () {

    return (
        <header>
            <nav className="container">
                <div className="dsmovie-nav-content">
                    <Link to="/">
                        <h1>DSMovie</h1>
                    </Link>
                    <a href="https://github.com/westorres9" target="_blank" rel="noreferrer">
                        <div className="dsmovie-contact-container">
                            <GthubIcon/>
                            <p className="dsmovie-contact-link">westorres9</p>
                        </div>    
                    </a>
                </div>
            </nav>
        </header>
    );
}

export default Navbar;