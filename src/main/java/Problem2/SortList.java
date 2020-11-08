package Problem2;

import java.util.ArrayList;

public class SortList {
    private static final int SENTRY = Integer.MAX_VALUE;
    // DO NOT ADD ANY NEW MEMBER VARIABLE AND MEMBER FUNCTION

    // DO NOT CHANGE ANYTHING IN THIS FUNCTION
    public static ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode mid = findMidAndBreak(head);
        return mergeLists(sortList(head), sortList(mid));
    }

    public static ListNode findMidAndBreak(ListNode head) {
        // homework
        if(head == null){
            return null;
        }
        ListNode current = head;
        int size = 1;
        if(current.next != null){
            current = current.next;
            size++;
        }
        if(current.next == null){
            int half = size / 2;
            for(int i = 0; i < half; i++){
                current = head;
                break;
            }
        }
        findMidAndBreak(current);
        return current;
    }

    public static ListNode mergeLists(ListNode list1, ListNode list2) {
        // homework
        return null;

    }
}
