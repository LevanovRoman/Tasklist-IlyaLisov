INSERT INTO users (name, username, password)
VALUES ('Northrup Vasiltsov', 'nvasiltsov0@github.com', '$2a$04$pYTRvtiV0gWBpxrLi80r1.8gzlRPijUMngUI1Nt5OXnUdS6fF5W8G'),
('Lethia Eddolls', 'leddolls1@simplemachines.org', '$2a$04$JNgFx3EOsfiZYo8zceqfvOoOyrrBUf8YHW9D6VdwjOk/yvXSuDD6O'),
('Gerome Jasik', 'gjasik2@army.mil', '$2a$04$64OBbIyY/ULbYU/sMYx5Z.gVdm0eLoyuOY2Oy5E6n8l.5W16Dx1nm'),
('Florida Rigts', 'frigts3@jimdo.com', '$2a$04$2NM.7wvciPHwFM4jWHuw/epjJ8ocUu5XFMEzi6Se9egxpaQc6XXkS'),
('Cicily Coolson', 'ccoolson4@twitter.com', '$2a$04$1FO4kgeA.G8IuXxDc6Z2KePCcUIOt8XqojMkcf5/Nkiqnfx36om2m'),
('Robbie McKeller', 'rmckeller5@nytimes.com', '$2a$04$YwnvW.DxJ0jvxkIQ4a/fruo4398hd7Eo/QYPepuBdD.bxCjwJgYwq'),
('Ben MacCartair', 'bmaccartair6@businessinsider.com', '$2a$04$36KzFU2szr9j0nri0rupturvkzT/OIp14TZtD22953VwOkV.MjZiC'),
('Armin Dye', 'adye7@blogs.com', '$2a$04$yG98Vom4RcKu7Z1hmDo2nu9Du28hGwklxmwlxjzeQmiXcgf/WVTbG'),
('Killian Marginson', 'kmarginson8@mozilla.org', '$2a$04$/0CMkDHklpzM1tXcwrVNN.0.J7CTdVUYbzBREuf3ufAXduOF4rt62'),
('Royall Glisane', 'rglisane9@jugem.jp', '$2a$04$cKKwzkvXFpIB6XbrcL3k3.YDeLGI8df3zojkIq1X5ALhWB01cN4pu');

INSERT INTO tasks (title, description, status, expiration_date)
VALUES ('Desktop Support Technician', 'Torp, Gleichner and Denesik', 'TODO', '2017-11-13'),
('Analog Circuit Design manager', 'Weimann, Yost and Grimes', 'IN_PROGRESS', '2024-01-19'),
('Structural Engineer', 'Auer Inc', 'DONE', '2022-10-17'),
('Accounting Assistant II', 'Block, Halvorson and Cruickshank', 'IN_PROGRESS', '2024-01-23'),
('Account Coordinator', 'Bruen Inc', 'TODO', '2017-06-02'),
('Biostatistician II', 'Medhurst LLC', 'DONE', '2016-08-22'),
('Geologist I', 'Parisian-Volkman', 'TODO', '2022-02-15'),
('Professor', 'Altenwerth LLC', 'TODO', '2017-08-18'),
('Social Worker', 'Runte-Purdy', 'IN_PROGRESS', '2021-02-10'),
('Paralegal', 'Stoltenberg-Hegmann', 'TODO', '2016-09-20'),
('Actuary', 'O''Kon Inc', 'DONE', '2022-06-22'),
('Professor', 'Bernier, O''Conner and Corwin', 'DONE', '2021-11-22'),
('Staff Accountant III', 'Abbott-Grady', 'TODO', '2017-01-06'),
('VP Sales', 'Bruen, Parisian and Kiehn', 'IN_PROGRESS', '2020-03-27'),
('Cost Accountant', 'Hessel-Bruen', 'TODO', '2017-01-12'),
('Safety Technician II', 'Auer Inc', 'DONE', '2018-03-20'),
('Legal Assistant', 'Streich, Howe and Paucek', 'TODO', '2023-01-16'),
('Geologist II', 'Feil, Rohan and Becker', 'IN_PROGRESS', '2021-05-07'),
('Systems Administrator I', 'Armstrong-Casper', 'TODO', '2017-07-15'),
('Physical Therapy Assistant', 'Kunze LLC', 'TODO', '2017-09-25');

insert into users_tasks (task_id, user_id)
values (1, 2), (2, 8), (3, 1), (4, 3), (5, 2), (6, 5), (7, 2), (8, 9), (9, 5), (10, 6),
       (11, 3), (12, 7), (13, 8), (14, 4), (15, 2), (16, 1), (17, 8), (18, 9), (19, 10), (20, 5);

insert into users_roles (user_id, role)
values (1, 'ROLE_ADMIN'), (2, 'ROLE_USER'), (3, 'ROLE_USER'), (4, 'ROLE_USER'), (5, 'ROLE_USER'), (6, 'ROLE_USER'),
       (7, 'ROLE_USER'), (8, 'ROLE_USER'), (9, 'ROLE_USER'), (10, 'ROLE_USER'), (1, 'ROLE_USER'), (6, 'ROLE_ADMIN'),
       (2,'ROLE_ADMIN' ), (8, 'ROLE_ADMIN');


