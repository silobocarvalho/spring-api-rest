INSERT INTO USER(name, email, password) VALUES('Student', 'student@email.com', '123456');

INSERT INTO COURSE(name, category) VALUES('Spring Boot', 'Programming');
INSERT INTO COURSE(name, category) VALUES('HTML 5', 'Front-end');

INSERT INTO TOPIC (title, message, creation_date, status, author_id, course_id) VALUES('Question 1', 'Project error', '2019-05-05 18:00:00', 'NOT_ANSWERED', 1, 1);
INSERT INTO TOPIC (title, message, creation_date, status, author_id, course_id) VALUES('Question 2', 'Compilation problem', '2019-05-05 19:00:00', 'NOT_ANSWERED', 1, 1);
INSERT INTO TOPIC (title, message, creation_date, status, author_id, course_id) VALUES('Question 3', 'Tag HTML', '2019-05-05 20:00:00', 'NOT_ANSWERED', 1, 2);