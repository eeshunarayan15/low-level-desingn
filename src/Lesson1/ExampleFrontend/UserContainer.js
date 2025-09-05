import {UserProfile} from "./userFetcher";

function  userContainer(){
    const {user,loading,error}=userFetcher(123);
    if(loading) return <div>loading</div>;
    if(error) return  <div>{error}</div>;
    return  user? <UserProfile user={user} /> :<div>No user data</div>;
}