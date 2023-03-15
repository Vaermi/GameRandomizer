package model;

import javafx.beans.property.SimpleStringProperty;

public class TableElement {

    private final SimpleStringProperty title;
    private final SimpleStringProperty mainGenre;
    private final SimpleStringProperty secondGenre;
    private final SimpleStringProperty duration;
    private final SimpleStringProperty achievements;
    private final SimpleStringProperty check;

    public TableElement(String title, String mainGenre, String secondGenre, String duration, String achievements, String check) {
        this.title = new SimpleStringProperty(title);
        this.mainGenre = new SimpleStringProperty(mainGenre);
        this.secondGenre = new SimpleStringProperty(secondGenre);
        this.duration = new SimpleStringProperty(duration);
        this.achievements = new SimpleStringProperty(achievements);
        this.check = new SimpleStringProperty(check);
    }

    public String getTitle() {
        return title.get();
    }

    public void setTitle(String name) {
        title.set(name);
    }

    public String getMainGenre() {
        return mainGenre.get();
    }

    public void setMainGenre(String genre) {
        mainGenre.set(genre);
    }

    public String getSecondGenre() {
        return secondGenre.get();
    }

    public void setSecondGenre(String genre) {
        secondGenre.set(genre);
    }

    public String getDuration() {
        return duration.get();
    }

    public void setDuration(String time) {
        duration.set(time);
    }

    public String getAchievements() {
        return achievements.get();
    }

    public void setAchievements(String avs) {
        achievements.set(avs);
    }

    public String getCheck() {
        return check.get();
    }

    public void setCheck(String chck) {
        check.set(chck);
    }

}
