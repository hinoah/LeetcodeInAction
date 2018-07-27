package leetcode.easy;

/**
 * 551. Student Attendance Record I
 *
 * You are given a string representing an attendance record for a student.
 * The record only contains the following three characters:
 * 'A' : Absent.
 * 'L' : Late.
 * 'P' : Present.
 * A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).
 *
 * You need to return whether the student could be rewarded according to his attendance record.
 *
 * Example 1:
 * Input: "PPALLP"
 * Output: True
 *
 * Example 2:
 * Input: "PPALLL"
 * Output: False
 *
 * @author <a href="mailto:hefangzhou@vpgame.cn">hefangzhou</a>
 * @date 2017/12/19 下午1:48
 */
public class StudentAttendanceRecord {

    public boolean checkRecord(String s) {
        return !s.matches("\\*LLL\\*|\\*A\\*A\\*");
    }


}
















//         return !s.matches("\\*LLL\\*|\\*A\\*A\\*");

