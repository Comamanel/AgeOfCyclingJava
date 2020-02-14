INSERT INTO DB2ADMIN.ROAD_SKILL (ID, LABEL) VALUES (1, 'STAMINA');
INSERT INTO DB2ADMIN.ROAD_SKILL (ID, LABEL) VALUES (2, 'HILLS');
INSERT INTO DB2ADMIN.ROAD_SKILL (ID, LABEL) VALUES (3, 'FLAT');
INSERT INTO DB2ADMIN.ROAD_SKILL (ID, LABEL) VALUES (4, 'MOUNTAIN');
INSERT INTO DB2ADMIN.ROAD_SKILL (ID, LABEL) VALUES (5, 'COBBLES');
INSERT INTO DB2ADMIN.ROAD_SKILL (ID, LABEL) VALUES (6, 'DOWNHILL');
INSERT INTO DB2ADMIN.ROAD_SKILL (ID, LABEL) VALUES (7, 'SPRINT');
INSERT INTO DB2ADMIN.ROAD_SKILL (ID, LABEL) VALUES (8, 'PUNCH');
INSERT INTO DB2ADMIN.ROAD_SKILL (ID, LABEL) VALUES (9, 'RESISTANCE');

INSERT INTO DB2ADMIN.CROSS_SKILL (ID, LABEL) VALUES (10, 'BALANCE');
INSERT INTO DB2ADMIN.CROSS_SKILL (ID, LABEL) VALUES (11, 'CLIMB');
INSERT INTO DB2ADMIN.CROSS_SKILL (ID, LABEL) VALUES (12, 'CLIMBRUN');
INSERT INTO DB2ADMIN.CROSS_SKILL (ID, LABEL) VALUES (13, 'FLATRUN');
INSERT INTO DB2ADMIN.CROSS_SKILL (ID, LABEL) VALUES (14, 'MUD');
INSERT INTO DB2ADMIN.CROSS_SKILL (ID, LABEL) VALUES (15, 'PLANKS');
INSERT INTO DB2ADMIN.CROSS_SKILL (ID, LABEL) VALUES (16, 'SAND');
INSERT INTO DB2ADMIN.CROSS_SKILL (ID, LABEL) VALUES (17, 'SOIL');
INSERT INTO DB2ADMIN.CROSS_SKILL (ID, LABEL) VALUES (18, 'STAIRS');
INSERT INTO DB2ADMIN.CROSS_SKILL (ID, LABEL) VALUES (19, 'éàèê$&');

INSERT INTO DB2ADMIN.SURFACE (ID, LABEL) VALUES (1, 'stairs');
INSERT INTO DB2ADMIN.SURFACE (ID, LABEL) VALUES (2, 'grass');
INSERT INTO DB2ADMIN.SURFACE (ID, LABEL) VALUES (3, 'soil');
INSERT INTO DB2ADMIN.SURFACE (ID, LABEL) VALUES (4, 'mud');
INSERT INTO DB2ADMIN.SURFACE (ID, LABEL) VALUES (5, 'sand');
INSERT INTO DB2ADMIN.SURFACE (ID, LABEL) VALUES (6, 'road');
INSERT INTO DB2ADMIN.SURFACE (ID, LABEL) VALUES (7, 'planks');
INSERT INTO DB2ADMIN.SURFACE (ID, LABEL) VALUES (8, 'cobbles');

INSERT INTO DB2ADMIN.ROLE_USERS (ROLE_ID, LABEL) VALUES (1, 'ROLE_ADMIN');
INSERT INTO DB2ADMIN.ROLE_USERS (ROLE_ID, LABEL) VALUES (2, 'ROLE_MODERATOR');
INSERT INTO DB2ADMIN.ROLE_USERS (ROLE_ID, LABEL) VALUES (3, 'ROLE_MEMBER');

INSERT INTO DB2ADMIN.CYCLIST (CYCLIST_ID, AGE_DAYS, AGE_MONTH, AGE_YEARS, COUNTRY, FIRST_NAME, HEIGHT, LAST_NAME, WEIGHT) VALUES (1, 10, 2, 25, 'Belgium', 'Florent', 1.87, 'Piette', 82);

INSERT INTO DB2ADMIN.RACE (ID, LENGTH, NAME, NB_LAPS) VALUES (1, 20, 'Cyclo-cross de Namur', 9);

INSERT INTO DB2ADMIN.SKILL_SET (VALUE, SKILL_ID, CYCLIST_ID) VALUES (9, 1, 1);
INSERT INTO DB2ADMIN.SKILL_SET (VALUE, SKILL_ID, CYCLIST_ID) VALUES (9, 2, 1);
INSERT INTO DB2ADMIN.SKILL_SET (VALUE, SKILL_ID, CYCLIST_ID) VALUES (8, 3, 1);
INSERT INTO DB2ADMIN.SKILL_SET (VALUE, SKILL_ID, CYCLIST_ID) VALUES (5, 4, 1);
INSERT INTO DB2ADMIN.SKILL_SET (VALUE, SKILL_ID, CYCLIST_ID) VALUES (1, 5, 1);
INSERT INTO DB2ADMIN.SKILL_SET (VALUE, SKILL_ID, CYCLIST_ID) VALUES (10, 6, 1);
INSERT INTO DB2ADMIN.SKILL_SET (VALUE, SKILL_ID, CYCLIST_ID) VALUES (9, 7, 1);
INSERT INTO DB2ADMIN.SKILL_SET (VALUE, SKILL_ID, CYCLIST_ID) VALUES (10, 8, 1);
INSERT INTO DB2ADMIN.SKILL_SET (VALUE, SKILL_ID, CYCLIST_ID) VALUES (10, 9, 1);
INSERT INTO DB2ADMIN.SKILL_SET (VALUE, SKILL_ID, CYCLIST_ID) VALUES (10, 10, 1);
INSERT INTO DB2ADMIN.SKILL_SET (VALUE, SKILL_ID, CYCLIST_ID) VALUES (9, 11, 1);
INSERT INTO DB2ADMIN.SKILL_SET (VALUE, SKILL_ID, CYCLIST_ID) VALUES (10, 12, 1);
INSERT INTO DB2ADMIN.SKILL_SET (VALUE, SKILL_ID, CYCLIST_ID) VALUES (10, 13, 1);
INSERT INTO DB2ADMIN.SKILL_SET (VALUE, SKILL_ID, CYCLIST_ID) VALUES (9, 14, 1);
INSERT INTO DB2ADMIN.SKILL_SET (VALUE, SKILL_ID, CYCLIST_ID) VALUES (6, 15, 1);
INSERT INTO DB2ADMIN.SKILL_SET (VALUE, SKILL_ID, CYCLIST_ID) VALUES (9, 16, 1);
INSERT INTO DB2ADMIN.SKILL_SET (VALUE, SKILL_ID, CYCLIST_ID) VALUES (10, 17, 1);
INSERT INTO DB2ADMIN.SKILL_SET (VALUE, SKILL_ID, CYCLIST_ID) VALUES (9, 18, 1);

INSERT INTO DB2ADMIN.STRETCH (STRETCH_ID, DIFFICULTY, LENGTH, SLOPE, RACE_ID, SURFACE_ID) VALUES (1, 1, 0.2, 0, 1, 6);
INSERT INTO DB2ADMIN.STRETCH (STRETCH_ID, DIFFICULTY, LENGTH, SLOPE, RACE_ID, SURFACE_ID) VALUES (2, 1, 0.2, 0, 1, 2);
INSERT INTO DB2ADMIN.STRETCH (STRETCH_ID, DIFFICULTY, LENGTH, SLOPE, RACE_ID, SURFACE_ID) VALUES (3, 3, 0.02, 30, 1, 1);
INSERT INTO DB2ADMIN.STRETCH (STRETCH_ID, DIFFICULTY, LENGTH, SLOPE, RACE_ID, SURFACE_ID) VALUES (4, 2, 0.08, -10, 1, 4);

