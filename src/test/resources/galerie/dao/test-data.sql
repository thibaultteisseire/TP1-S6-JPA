-- Initialisation spécifiques pour un jeu de test
INSERT INTO Galerie(id, nom, adresse) VALUES (1, 'Saatchi', 'King\''s Road, Londres');
INSERT INTO Galerie(id, nom, adresse) VALUES (2, 'Louvre', 'Musee du Louvre, Paris');

INSERT INTO Personne(id,nom,adresse) VALUES (1, 'Kylo Ren','14 rue du Lac, Exegol');
INSERT INTO Personne(id,nom,adresse) VALUES (2, 'Rey', '6 rue des Sablieres, Jakku');
INSERT INTO Personne(id,nom,adresse) VALUES (3,'De Vinci','5 rue de Naples, Florence');
INSERT INTO Personne(id,nom,adresse) VALUES (4,'Picasso','5 rue de Barcelone, Madrid');
INSERT INTO Personne(id,nom,adresse) VALUES (5,'Dali','5 rue de Valence, Grenade');

INSERT INTO Artiste(id,biographie) VALUES (4,'Je suis espagnol');
INSERT INTO Artiste(id,biographie) VALUES (3, 'C est moi qui ai fait la Joconde');
INSERT INTO Artiste(id,biographie) VALUES (5, 'J adore la mer');

INSERT INTO Exposition(id,debut,intitule,duree,organisateur_id) VALUES (1,TO_DATE('2020/03/15','YYYY/MM/DD'),'Renaissance',30,2);
INSERT INTO Exposition(id,debut,intitule,duree,organisateur_id) VALUES (2,TO_DATE('2020/06/12','YYYY/MM/DD'),'Cubisme',60,1);

INSERT INTO Transaction(id,vendu_le,prix_vente,client_id,lieu_de_vente_id) VALUES (1,TO_DATE('2020/03/20','YYYY/MM/DD'),5000000,2,1);
INSERT INTO Transaction(id,vendu_le,prix_vente,client_id,lieu_de_vente_id) VALUES (2,TO_DATE('2020/06/20','YYYY/MM/DD'),1000000,1,2);
INSERT INTO Transaction(id,vendu_le,prix_vente,client_id,lieu_de_vente_id) VALUES (3,TO_DATE('2020/07/30','YYYY/MM/DD'),2000000,1,2);

INSERT INTO Tableau(id,titre,support,largeur,hauteur,auteur_id,vendu_id) VALUES (1,'La Joconde','toile',100,20,3,1);
INSERT INTO Tableau(id,titre,support,largeur,hauteur,auteur_id,vendu_id) VALUES (2,'Guernica','toile',80,40,4,2);
INSERT INTO Tableau(id,titre,support,largeur,hauteur,auteur_id,vendu_id) VALUES (3,'La persistance de la memoire','peinture',90,40,5,3);