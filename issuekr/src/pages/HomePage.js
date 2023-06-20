import { useEffect, useState } from "react";
import { AllApiMapHandler } from "../apihandler/HomeApiHandler";
import Header from "../components/Header";
import IssueMap from "../components/IssueMap";
import Footer from "../components/Footer";
import { ResponsiveDiv } from "../components/Responsive";
import NavBar from "../components/NavBar";

const Homepage = () => {
  const [pings, setPings] = useState([]);

  useEffect(() => {
    apiHandle();
  }, []);

  const apiHandle = async () => {
    const response = await AllApiMapHandler();
    console.log(response);
    setPings(response);
  };

  return (
    <ResponsiveDiv>
      <Header />
      <NavBar />
      <IssueMap pings={pings} />
      <Footer />
    </ResponsiveDiv>
  );
};

export default Homepage;
