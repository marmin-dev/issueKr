import { Route, Routes } from "react-router";
import DetailPage from "./pages/DetailPage";
import AllListPage from "./pages/AllListPage";
import TodayListPage from "./pages/TodayListPage";
import Homepage from "./pages/HomePage";

const App = () => {
  return (
    <Routes>
      <Route path="/" element={<Homepage />} />
      <Route path="/detail/:id" element={<DetailPage />} />
      <Route path="/all" element={<AllListPage />} />
      <Route path="/today" element={<TodayListPage />} />
    </Routes>
  );
};
export default App;
