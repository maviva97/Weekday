public enum Weekday {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

    public Boolean isWeekDay() {
        return (this != Weekday.Saturday && this!= Weekday.Sunday);

    }
    public Boolean isHoliday() {
        return (this == Weekday.Saturday || this == Weekday.Sunday);

    }
    }