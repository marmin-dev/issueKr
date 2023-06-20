import { Route, Routes } from "react-router";
import DetailPage from "./pages/DetailPage";
import AllListPage from "./pages/AllListPage";
import TodayListPage from "./pages/TodayListPage";
import Homepage from "./pages/HomePage";
import "./App.css";

const App = () => {
  return (
    <div className="center-container">
      <Routes>
        <Route path="/" element={<Homepage />} />
        <Route path="/detail/:id" element={<DetailPage />} />
        <Route path="/all" element={<AllListPage />} />
        <Route path="/today" element={<TodayListPage />} />
      </Routes>
    </div>
  );
};
export default App;
