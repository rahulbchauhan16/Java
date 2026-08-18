
class Candidate {
    int Candidate_ID;
    String Candidate_Name;
    int Candidate_Age;
    float Candidate_Weight;
    float Candidate_Height;

    public void GetCandidateDetails(int Candidate_ID, String Candidate_Name, int Candidate_Age, float Candidate_Weight,
            float Candidate_Height) {
        this.Candidate_ID = Candidate_ID;
        this.Candidate_Name = Candidate_Name;
        this.Candidate_Age = Candidate_Age;
        this.Candidate_Weight = Candidate_Weight;
        this.Candidate_Height = Candidate_Height;
    }

    public void DisplayCandidateDetails() {
        System.out.println("Candidate Id : " + this.Candidate_ID);
        System.out.println("Candidate Name : " + this.Candidate_Name);
        System.out.println("Candidate Age : " + this.Candidate_Age);
        System.out.println("Candidate Weight : " + this.Candidate_Weight);
        System.out.println("Candidate Height : " + this.Candidate_Height);
    }
}

public class candidateclass {
    public static void main(String[] args) {
        Candidate ob = new Candidate();
        ob.GetCandidateDetails(101, "Ram", 24, 55, 170);
        ob.DisplayCandidateDetails();
    }
}
