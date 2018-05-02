// Given a collection of meetings (each has a start time and an end time, positive integer type, start time is inclusive and end time is exclusive), return whether if all meetings can be held in one meeting room
// [(1,3), (6,8), (3,5)]  -> True

// ##*******
// *****##**
// **##*****


// [(1,2), (4,6), (3,5)]  -> False

// #*********
// ***##*****
// **##******


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

public class SameMeeting {
  public static void main(String[] args) {


    ArrayList<MeetingTime> input = new ArrayList<MeetingTime>();
    input.add(new MeetingTime(1,10));
    input.add(new MeetingTime(11,12));
    input.add(new MeetingTime(4,5));

    Collections.sort(input, new MeetingComparator());

    System.out.print(meetingsInTheSameRoom(input));

  }

  static public boolean meetingsInTheSameRoom(ArrayList<MeetingTime> meetings)
  {

    if(meetings.size() == 0)
      return false;

    for(int i=1; i<meetings.size(); i++)
    {
      if(meetings.get(i-1).end > meetings.get(i).start)
        return false;
    }

    return true;

  }

  static class MeetingTime {
    int start;
    int end;

    MeetingTime(int start, int end)
    {
      this.start = start;
      this.end = end;

    }


  }


  static class MeetingComparator implements Comparator<MeetingTime> {

    @Override
    public int compare(MeetingTime a, MeetingTime b)
    {
      return a.start - b.start;
    }

  }


}


