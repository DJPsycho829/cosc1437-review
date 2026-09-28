public class P04_FindSeasonTest {
    public static void main(String[] args) {
        String[][] table = {
            {"January", "Winter"}, {"April", "Spring"}, {"July", "Summer"}, {"October", "Fall"}
        };
        String t = "{{\"January\", \"Winter\"}, {\"April\", \"Spring\"}, {\"July\", \"Summer\"}, {\"October\", \"Fall\"}}";
        T.check("findSeason(" + t + ", \"July\")", "Summer", () -> P04_FindSeason.findSeason(table, "July"));
        T.check("findSeason(" + t + ", \"january\")", "Winter", () -> P04_FindSeason.findSeason(table, "january"));
        T.check("findSeason(" + t + ", \"OCTOBER\")", "Fall", () -> P04_FindSeason.findSeason(table, "OCTOBER"));
        T.check("findSeason(" + t + ", \"May\")", "not found", () -> P04_FindSeason.findSeason(table, "May"));
        T.check("findSeason(" + t + ", \"Winter\")", "not found", () -> P04_FindSeason.findSeason(table, "Winter"));
        T.done();
    }
}
