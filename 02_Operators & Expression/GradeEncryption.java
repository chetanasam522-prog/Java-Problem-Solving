//   # Problem-Statement:-Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.

//  # Logic (Step-by-Step):-
// . Store the original grade in a char variable.
// . Encrypt the grade by adding 8 to its ASCII value.
// . Typecast the result back to char.
// . Decrypt by subtracting 8 from the encrypted grade.
// . Display original, encrypted, and decrypted grades.

//  # Time & Space Complexity:-
//  . Time Complexity = O(n)
//  . Space Complexity = O(n)

//   # Solution:-

public class GradeEncryption {
    public static void main(String[] args) {

        // Original grade
        char grade = 'B';

        // Encrypt the grade by adding 8
        char encryptedGrade = (char) (grade + 8);

        // Decrypt the grade by subtracting 8
        char decryptedGrade = (char) (encryptedGrade - 8);

        // Display results
        System.out.println("Original Grade   : " + grade);
        System.out.println("Encrypted Grade  : " + encryptedGrade);
        System.out.println("Decrypted Grade  : " + decryptedGrade);
            
    }
        
}
