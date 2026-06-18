class Solution {
    public double angleClock(int hour, int minutes) {
        double minuteAngle = minutes * 6; // 360/60
        double hourAngle = (hour % 12) * 30 + minutes * 0.5; // 360/12 + movement by minutes

        double angle = Math.abs(hourAngle - minuteAngle);

        return Math.min(angle, 360 - angle);
    }
}