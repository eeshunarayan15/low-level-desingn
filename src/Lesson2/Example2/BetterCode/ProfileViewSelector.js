const ProfileViewSelector = {
  getProfileView(role) {
    switch ( role ) {
        case 'admin': return <AdminView />
        case 'editory': return <EditorView />
        default: return <StartView/>
    }
  },
};
export default ProfileViewSelector;
