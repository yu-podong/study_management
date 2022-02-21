import React from "react";
import { Route, Routes, Link } from "react-router-dom";

// component
import MainPage from './pages/MainPage';
import RegisterPage from './pages/RegisterPage';
import StudyPage from './pages/study/StudyPage';
import CreateStudyPage from './pages/study/CreateStudyPage';
import ApplyStudyPage from './pages/study/ApplyStudyPage';
import StudyGroupPage from './pages/study/StudyGroupPage';
import StudyManagePage from './pages/admin/StudyManagePage';
import StudyCommunityPage from './pages/commu/StudyCommunityPage';
import StudyCommunityReadPage from './pages/commu/StudyCommunityReadPage'
import StudyCommunityWritePage from './pages/commu/StudyCommunityWritePage'
import UserInfoPage from './pages/user/UserInfoPage';
import CheckStudyListPage from './pages/user/CheckStudyList';
import CheckMemberListPage from './pages/admin/CheckMemberListPage';

// css
import './App.css';
import './style/main.css';

function App() {
  // const [user, setUser] = useState("");
  // useEffect(()=>{
  //   Axios.get("/api/users").then((response)=>{
  //     if(response.data) {
  //       console.log(response.data)
  //       setUser(response.data);
  //     } else {
  //       alert("failed to");
  //     }
  //   });
  // }, []);
  return (
    <div className='App'>
      <Routes>
        <Route path="/" element={<MainPage />} exact />
        <Route path="/register" element={<RegisterPage />} />

        <Route path="/study/list" element={<StudyPage />} />
        <Route path="/study/create" element={<CreateStudyPage />} />
        <Route path="/study/apply" element={<ApplyStudyPage />} />

        <Route path="/study/mainpage" element={<StudyGroupPage />} />
        <Route path="/study/member/list" element={<StudyManagePage />} />

        <Route path="/commu/list" element={<StudyCommunityPage />} />
        <Route path="/commu/read" element={<StudyCommunityReadPage />} />
        <Route path="/commu/write" element={<StudyCommunityWritePage />} />

        <Route path="/user/show/info" element={<UserInfoPage />} />
        <Route path="/user/list/study" element={<CheckStudyListPage />} />

        <Route path="/admin/all-user/list" element={<CheckMemberListPage />} />
      </Routes>
    </div>
  );
}

export default App;
