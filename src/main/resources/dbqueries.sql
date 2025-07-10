-- Insert into about_me
INSERT INTO public.about_me (id, address, email, introduction, phone_no) VALUES
(1, 'Bangalore, India', 'lakshdevali05@gmail.com',
 'Java Backend Engineer with 5+ years experience in Java, Spring Boot, REST APIs',
 '+91 98805 56134');


-- Insert into education
INSERT INTO public.education (college_name, degree, from_date, location, to_date) VALUES
('KLE Dr. M.S. Sheshgiri College of Engineering, Belgaum (VTU)', 'B.E. – Computer Science Engineering', '2016', 'Belgaum', '2019'),
('Govt. Polytechnic College, Joida', 'Diploma – Computer Science Engineering', '2013', 'Joida', '2016');


-- Insert into experience
INSERT INTO public.experience (company, description_bullets, from_date, location, role, to_date) VALUES
('TerraPay',
 ARRAY[
  'Led end-to-end execution of the MRSP initiative for Airtel and MTN, boosting revenue and volume by 27%',
  'Integrated global partners into TerraPay’s enterprise-grade cross-border payments platform',
  'Built robust APIs to fetch, validate, and process JSON/XML data from third-party systems',
  'Collaborated across teams to ensure system resilience, high availability, and data integrity'
 ],
 'Oct 2022', 'Bangalore', 'Software Engineer II', 'Present'),

('Go Digit',
 ARRAY[
  'Developed enterprise-level Core Java applications using Allianz framework in the insurance domain',
  'Implemented OOP-based dispatcher models to support multi-app integration with minimal effort',
  'Delivered hotfixes for production issues in a fast-paced Agile environment',
  'Liaised with business analysts and frontend teams to translate complex requirements into backend logic',
  'Consistently delivered complete products within tight deadlines'
 ],
 'Jul 2019', 'Bangalore', 'Senior Software Engineer', 'Sep 2022');


-- Insert into project
INSERT INTO public.project (description, name, project_link, technologies) VALUES
('Developed services for Quick Quote, Create, Update, and Search Quote modules',
 'DigitMyBusiness – Insurance platform for property quotes', NULL,
 ARRAY['Java', 'Spring Boot', 'REST APIs']),

('Built backend services for handling lifecycle of insurance quotes',
 'AssetCare – Platform for insuring electronic equipment', NULL,
 ARRAY['Java', 'Spring Boot']),

('Implemented services for validation, transaction creation, payment, and status tracking using REST APIs',
 'Airtel ONNET – Cross-border money transfer platform', NULL,
 ARRAY['Java', 'Spring Boot', 'REST APIs']);


-- Insert into reach_out (sample/dummy data)
INSERT INTO public.reach_out (email, message, name, subject, phone_no) VALUES
('lakshdevali05@gmail.com', 'Hi Lakshman, I would like to connect regarding a backend role.', 'Recruiter Name', 'Job Opportunity', '+91 98805 56134');


-- Insert into skills
-- Languages & Frameworks
INSERT INTO public.skills (tech, "type") VALUES
('Java', 'Languages & Frameworks'),
('SQL', 'Languages & Frameworks'),
('Spring Boot', 'Languages & Frameworks'),
('Servlets', 'Languages & Frameworks'),
('JSP', 'Languages & Frameworks');

-- APIs & Services
INSERT INTO public.skills (tech, "type") VALUES
('REST APIs', 'APIs & Services'),
('Microservices', 'APIs & Services');

-- Tools & Platforms
INSERT INTO public.skills (tech, "type") VALUES
('Git', 'Tools & Platforms'),
('Bitbucket', 'Tools & Platforms'),
('SVN', 'Tools & Platforms'),
('Jenkins', 'Tools & Platforms'),
('Postman', 'Tools & Platforms'),
('JIRA', 'Tools & Platforms');

-- Other
INSERT INTO public.skills (tech, "type") VALUES
('Agile', 'Other'),
('Hubspot', 'Other');


-- Insert into welcome
INSERT INTO public.welcome (id, message) VALUES
(1, 'Hey there! I’m Lakshman – Java Backend Developer with a knack for clean code and clean architecture.');
