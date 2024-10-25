import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Resume {
    private String name;
    private String email;
    private String phone;
    private String summary;
    private String experience;
    private String education;
    private String skills;

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getSummary() { return summary; }
    public void setSummary(String summary) { this.summary = summary; }

    public String getExperience() { return experience; }
    public void setExperience(String experience) { this.experience = experience; }

    public String getEducation() { return education; }
    public void setEducation(String education) { this.education = education; }

    public String getSkills() { return skills; }
    public void setSkills(String skills) { this.skills = skills; }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
               "Email: " + email + "\n" +
               "Phone: " + phone + "\n" +
               "Summary: " + summary + "\n" +
               "Experience: " + experience + "\n" +
               "Education: " + education + "\n" +
               "Skills: " + skills + "\n";
    }
}

public class ResumeBuilder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Resume resume = new Resume();

        // Collecting Resume Information
        System.out.println("Enter your name: ");
        resume.setName(scanner.nextLine());

        System.out.println("Enter your email: ");
        resume.setEmail(scanner.nextLine());

        System.out.println("Enter your phone number: ");
        resume.setPhone(scanner.nextLine());

        System.out.println("Enter a brief summary about yourself: ");
        resume.setSummary(scanner.nextLine());

        System.out.println("Enter your work experience (separated by commas): ");
        resume.setExperience(scanner.nextLine());

        System.out.println("Enter your education (separated by commas): ");
        resume.setEducation(scanner.nextLine());

        System.out.println("Enter your skills (separated by commas): ");
        resume.setSkills(scanner.nextLine());

        // Saving the resume as a text file
        saveResumeToFile(resume);

        System.out.println("Resume saved successfully.");
    }

    public static void saveResumeToFile(Resume resume) {
        try {
            FileWriter writer = new FileWriter("resume.txt");
            writer.write(resume.toString());
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while saving the resume.");
            e.printStackTrace();
        }
    }
}
