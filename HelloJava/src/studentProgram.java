    import java.io.BufferedReader;
    import java.io.FileReader;
    import java.io.IOException;
    import java.io.PrintWriter;
    import java.util.*;

    public class studentProgram {

        public static void main(String[] args) {

            Map<String, List<Integer>> students = new HashMap<>();

            try (BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\ergan\\Desktop\\students.txt"))) {
                String line;
                while ((line = file.readLine()) != null) {
                    if (!(line.contains(":"))) {
                        System.err.println("Ошибка в строке: " + line);
                        continue;
                    }

                    String[] parts = line.split(":");
                    String studentName;
                    String[] studentGrades;

                    if (parts.length == 2) {
                        studentName = parts[0].trim();
                        studentGrades = parts[1].trim().split(",");
                    } else {
                        System.err.println("Ошибка в строке: " + line);
                        continue;
                    }

                    boolean hasNonNumber = Arrays.stream(studentGrades).map(String::trim).anyMatch(s -> !s.matches("-?\\d+"));
                    if (hasNonNumber) {
                        System.err.println("Ошибка в строке: " + line);
                        continue;
                    }

                    List<Integer> realGrades = new ArrayList<>();
                    for (String s : studentGrades) {
                        realGrades.add(Integer.parseInt(s));
                    }
                    students.put(studentName, realGrades);
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

            List<Student> studentList = students.entrySet().stream().map(entry -> new Student(entry.getKey(), entry.getValue().stream().mapToInt(i -> i).toArray())).toList();
            List<Student> topStudents = studentList.stream().filter(s -> s.getAverage() >= 4.5).sorted(Comparator.comparingDouble(Student::getAverage).reversed()).toList();
            Box<List<Student>> bestStudents = new Box<>(topStudents);

            Formatter<Student> formatter;
            formatter = student -> System.out.printf("%s — средний балл: %.2f", student.getName(), student.getAverage()).toString();

            try (PrintWriter writer = new PrintWriter("C:\\Users\\ergan\\Desktop\\honors.txt")) {
                for (Student s : bestStudents.get()) {
                    writer.println(formatter.format(s));
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }

        }

    }

    class Student {
        private String name;
        private int[] grades;

        Student(String name, int[] grades) {
            setName(name);
            setGrades(grades);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setGrades(int[] grades) {
            this.grades = grades;
        }

        public double getAverage() {
            int sum = 0;
            for (int grade : grades) {
                sum += grade;
            }
            return (double) sum / grades.length;
        }
    }

    interface Formatter<T> {
        String format(T obj);
    }

    class Box<T> {
        private final T value;

        public Box(T value) {
            this.value = value;
        }

        public T get() {
            return value;
        }

    }