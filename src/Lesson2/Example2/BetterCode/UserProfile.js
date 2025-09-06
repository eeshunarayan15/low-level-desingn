const Userprofile = ({user}) => {
    const profileView=ProfileViewSelector(user.role);
    return <ProfileView user={user}/>

    
}
export default Userprofile