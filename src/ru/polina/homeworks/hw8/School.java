package ru.polina.homeworks.hw8;
import ru.polina.homeworks.hw8.school.Pupil;
import ru.polina.homeworks.hw8.school.Teacher;
import ru.polina.homeworks.hw8.school.Director;

import java.util.Arrays;

        public class School {

        private final String schoolName;
        private Director director;
        private Teacher[] teachers = new Teacher[12];
        private Pupil[] pupils = new Pupil[25];

        //private int teachersNumber = teachers.length;//работает учителей
        //private int pupilsNumber = 15; // ходят в школу


        public School(String schoolName, Director director){
                if (schoolName.length() < 3){
                        throw new IllegalArgumentException("Название школы не может содержать менее 3 симфолов");
                }
                this.schoolName = schoolName;
                this.director = director;
        }
        public void addTeacher() {
                for (int i = 0; i < teachers.length; i++){
                        teachers[i] = Teacher.getTeacher();
                }
        }



        /*public void schoolDay(){
                director.schoolDayBegin();
                for (Teacher teacher : teachers) {
                        if (teacher == null) break;
                        for (Pupil pupil : pupils) {
                                if(pupil == null) break;
                                if (pupil.getSubject().compareToIgnoreCase(teacher.getSubject()) == 0) {
                                        teacher.teach(pupil);
                                }
                        }
                }
                director.schoolDayEnd();
        }*/


        public String getSchoolName() {
                return schoolName;
        }

        public Director getDirector() {
                return director;
        }

        public Teacher[] getTeachers() {
                return teachers;
        }

        public Pupil[] getPupils() {
                return pupils;
        }

                @Override
                public String toString() {
                        return "School{" +
                                "schoolName='" + schoolName + '\'' +
                                ", director=" + director +
                                ", teachers=" + Arrays.toString(teachers) +
                                ", pupils=" + Arrays.toString(pupils) +
                                '}';
                }
        }

