class User {
    private String id;
    private String name;
    private String password;
    private String faculty;
    private String studyProgram;

    public User(String id, String name, String password, String faculty, String studyProgram) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.faculty = faculty;
        this.studyProgram = studyProgram;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getStudyProgram() {
        return studyProgram;
    }
}
