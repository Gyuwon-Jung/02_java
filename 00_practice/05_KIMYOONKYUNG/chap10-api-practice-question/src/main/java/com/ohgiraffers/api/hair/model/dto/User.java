package com.ohgiraffers.api.hair.model.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class User {
    //id,first_name,last_name,email,gender,
    //birthday,reservation_date,reservation_time,created_at

    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private String gender;
    private LocalDate birthday;
    private LocalDate reservation_date;
    private LocalTime reservation_time;
    private LocalDateTime created_at;


        /*초기화*/
    public User(int id, String first_name, String last_name, String email,
                String gender, LocalDate birthday,
                LocalDate reservation_date,
                LocalTime reservation_time, LocalDateTime created_at) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.gender = gender;
        this.birthday = birthday;
        this.reservation_date = reservation_date;
        this.reservation_time = reservation_time;
        this.created_at = created_at;


    }

        public String toString() {
            String birthdayString;
            if(birthday != null) {
                birthdayString = birthday.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            } else {
                birthdayString = "null";
            }

            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String timeString;
            if (reservation_time != null) {
                timeString = reservation_time.format(timeFormatter);
            } else {
                timeString = "null";
            }

            // 3. createdAt 포맷: 초가 0이면 생략, 아니면 포함
            DateTimeFormatter createdFormatter;
            if (created_at != null) {
                createdFormatter = DateTimeFormatter.ofPattern("HH:ss");
            } else {
                createdFormatter = null;
            }

         return
            "User{" +
            "id=" + id +
            ", first_name='" + first_name + '\'' +
            ", last_name='" + last_name + '\'' +
            ", email='" + email + '\'' +
            ", gender='" + gender + '\'' +
            ", birthday=" + birthdayString +
            ", reservation_date=" + reservation_date +
            ", reservation_time=" + reservation_time +
            ", created_at=" + created_at +
            '}';
        }
}
