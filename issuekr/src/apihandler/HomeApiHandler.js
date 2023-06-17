import axios from "axios";

export const AllApiHandler = async () => {
  try {
    const response = await axios.get(
      "http://localhost:8080/api/v1/issue/today/map"
    );
    return response.data;
  } catch (e) {
    console.log(e);
  }
};
