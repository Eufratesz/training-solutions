CREATE TABLE activities (id BIGINT AUTO_INCREMENT,
                         start_time TIMESTAMP,
                         activity_desc VARCHAR(255),
                         activity_type VARCHAR(255),
                         PRIMARY KEY (id));


CREATE TABLE track_points (id BIGINT AUTO_INCREMENT,
                            act_time Date,
                            lat DOUBLE,
                            lon DOUBLE,
                            activity_id BIGINT,PRIMARY KEY (id),
                            FOREIGN KEY (activity_id) REFERENCES activities(id));

insert into activities(start_time, activity_desc, activity_type) values ('2021-02-12 14:30:00', 'Biking in Bükk','BIKING');
insert into activities(start_time, activity_desc, activity_type) values ('2021-02-12 14:30:00', 'Hiking in Bükk','HIKING');
insert into activities(start_time, activity_desc, activity_type) values ('2020-02-12 14:30:00', 'Running in Bükk','RUNNING');
insert into activities(start_time, activity_desc, activity_type) values ('2019-06-12 14:30:00', 'Basketball in Park','BASKETBALL');

