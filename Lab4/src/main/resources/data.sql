
INSERT INTO users (id, name) VALUES (1, 'A');
INSERT INTO users (id, name) VALUES (2, 'B');
INSERT INTO users (id, name) VALUES (3, 'C');
INSERT INTO users (id, name) VALUES (4, 'D');




SELECT pg_catalog.setval('public.users_id_seq', 4, true);




INSERT INTO post (id, content, title, author_id) VALUES (1, 'AB!', 'Post 5', 1);
INSERT INTO post (id, content, title, author_id) VALUES (2, 'AB!!', 'Post 5', 1);
INSERT INTO post (id, content, title, author_id) VALUES (3, 'AB!!', 'Post 5', 1);
INSERT INTO post (id, content, title, author_id) VALUES (4, 'AB!!', 'Post 5', 1);
INSERT INTO post (id, content, title, author_id) VALUES (5, ' post 3 !', ' P5', 1);
INSERT INTO post (id, content, title, author_id) VALUES (6, 'ABY!', 'POST', 2);
INSERT INTO post (id, content, title, author_id) VALUES (7, 'ABNM!', 'Post ', 2);





SELECT pg_catalog.setval('public.post_id_seq', 25, true);

INSERT INTO comment (id, name, post_id) VALUES (1, 'comment', 1);
INSERT INTO comment (id, name, post_id) VALUES (2, ' comment', 2);
INSERT INTO comment (id, name, post_id) VALUES (3, 'comment', 3);


SELECT pg_catalog.setval('public.comment_id_seq', 33, true);