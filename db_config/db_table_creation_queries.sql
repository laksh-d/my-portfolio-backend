--database => my-portfolio;

--Tables : 
CREATE TABLE profile (
    profile_id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    introduction_desc VARCHAR(400) NOT NULL
);

CREATE TABLE about_me (
    id SERIAL PRIMARY KEY,
    description VARCHAR(255) NOT NULL,
    introduction_desc VARCHAR(400) NOT NULL
);

CREATE TABLE hobbies (
    id SERIAL PRIMARY KEY,
    hobby_name VARCHAR(50) NOT NULL,
	description VARCHAR(500) NOT NULL,
	about_me_id INT,
	CONSTRAINT fk_about_me FOREIGN KEY (about_me_id) REFERENCES about_me(id)
);

CREATE TABLE contact_me (
    id SERIAL PRIMARY KEY,
    phone_number VARCHAR(15) UNIQUE NOT NULL,
    email_id VARCHAR(100) UNIQUE NOT NULL,
	linkedin_profile VARCHAR(100) UNIQUE NOT NULL,
	github_profile VARCHAR(100) UNIQUE NOT NULL
);

ALTER TABLE profile ADD COLUMN aboutme_id INT, ADD CONSTRAINT fk_aboutme FOREIGN KEY (aboutme_id) REFERENCES about_me(id);
ALTER TABLE profile ADD COLUMN contact_me_id INT, ADD CONSTRAINT fk_contact_me FOREIGN KEY (contact_me_id) REFERENCES contact_me(id);






