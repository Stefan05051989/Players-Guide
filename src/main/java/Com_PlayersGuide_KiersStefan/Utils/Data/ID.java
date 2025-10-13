//package Com_PlayersGuide_KiersStefan.Utils.Data;
//import java.lang.reflect.Field;
//import java.time.LocalDate;
//import java.time.LocalTime;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
///*
//Setting up an ID template to start every project with :
// */
//
//class ID {
//    public static List<Student> createObject(Student st, List<Map<String, String>> csvStudentData) throws NoSuchFieldException {
//        List<Student> objectList = new ArrayList<>();
//        for (Map<String, String> studentData: csvStudentData){
//            Student student = new Student(st.id, st.name, st.age);
//            for (Map.Entry<String, String> entry = (Map.Entry<String, String>) studentData.entrySet()){
//                String key = entry.getKey();
//                String val = entry.getValue();
//                Field field = null;
//                try {
//                    field = Student.class.getDeclaredField(key);
//                } catch (NoSuchFieldException e) {
//                    throw new RuntimeException(e);
//                } catch (SecurityException e) {
//                    throw new RuntimeException(e);
//                }
//                student.set(field,val);
//                objectList.add(student);
//            }
//        }
//        return objectList;
//    }
//    static class Student{
//        int id;
//        String name;
//        int age;
//        LocalDate localDate = LocalDate.now();
//        LocalTime localTime = LocalTime.now();
//        public Student(int id, String name, int age) {
//            this.id = id;
//            this.name = name;
//            this.age = age;
//            this.localDate = LocalDate.now();
//            this.localTime = LocalTime.now();
//        }
//
//        public void set(Field field, String val) {
//        }
//    }
//}
