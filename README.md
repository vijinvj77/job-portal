# Job Portal

A full-stack job portal application built with Spring Boot and Angular, enabling job seekers to find opportunities and employers to post job listings.

## 🚀 Tech Stack

### Backend
- **Java** - Programming language
- **Spring Boot** - Backend framework
- **Maven** - Dependency management
- **Spring Data JPA** - Database interaction
- **Spring Security** - Authentication & authorization
- **MySQL/PostgreSQL** - Database (configure as needed)

### Frontend
- **Angular** - Frontend framework
- **TypeScript** - Programming language
- **HTML/CSS** - Markup and styling
- **RxJS** - Reactive programming
- **Angular Material** - UI components (optional)

## 📁 Project Structure

```
job-portal/
├── backend/          # Spring Boot application
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   └── resources/
│   │   └── test/
│   └── pom.xml
├── frontend/         # Angular application
│   ├── src/
│   │   ├── app/
│   │   └── assets/
│   ├── angular.json
│   └── package.json
└── README.md
```

## 📋 Prerequisites

Before you begin, ensure you have the following installed:

- **Java JDK 17+** - [Download](https://www.oracle.com/java/technologies/downloads/)
- **Maven 3.6+** - [Download](https://maven.apache.org/download.cgi)
- **Node.js 18+** - [Download](https://nodejs.org/)
- **Angular CLI** - Install via: `npm install -g @angular/cli`
- **MySQL/PostgreSQL** - [MySQL](https://www.mysql.com/downloads/) or [PostgreSQL](https://www.postgresql.org/download/)
- **Git** - [Download](https://git-scm.com/downloads)

## 🛠️ Installation & Setup

### 1. Clone the Repository

```bash
git clone <repository-url>
cd job-portal
```

### 2. Backend Setup

#### Configure Database

1. Create a database in MySQL/PostgreSQL:
```sql
CREATE DATABASE job_portal;
```

2. Update `backend/src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/job_portal
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

#### Build and Run Backend

```bash
cd backend
mvn clean install
mvn spring-boot:run
```

The backend server will start at `http://localhost:8080`

### 3. Frontend Setup

```bash
cd frontend
npm install
npm start
```

The frontend application will start at `http://localhost:4200`

## 🎯 Features

### For Job Seekers
- [ ] User registration and authentication
- [ ] Browse and search job listings
- [ ] Apply for jobs
- [ ] Upload and manage resumes
- [ ] Track application status
- [ ] Save favorite jobs

### For Employers
- [ ] Company registration
- [ ] Post job listings
- [ ] Manage job postings
- [ ] View applicant profiles
- [ ] Track applications
- [ ] Shortlist candidates

### Admin Features
- [ ] User management
- [ ] Job listing moderation
- [ ] Analytics dashboard
- [ ] System configuration

## 🔌 API Endpoints

### Authentication
- `POST /api/auth/register` - User registration
- `POST /api/auth/login` - User login
- `POST /api/auth/logout` - User logout

### Jobs
- `GET /api/jobs` - Get all jobs
- `GET /api/jobs/{id}` - Get job by ID
- `POST /api/jobs` - Create new job (Employer only)
- `PUT /api/jobs/{id}` - Update job (Employer only)
- `DELETE /api/jobs/{id}` - Delete job (Employer only)

### Applications
- `POST /api/applications` - Submit job application
- `GET /api/applications/user/{userId}` - Get user's applications
- `GET /api/applications/job/{jobId}` - Get applications for a job

### Users
- `GET /api/users/{id}` - Get user profile
- `PUT /api/users/{id}` - Update user profile
- `DELETE /api/users/{id}` - Delete user account

## 🧪 Testing

### Backend Tests
```bash
cd backend
mvn test
```

### Frontend Tests
```bash
cd frontend
npm test
```

### End-to-End Tests
```bash
cd frontend
npm run e2e
```

## 🏗️ Build for Production

### Backend
```bash
cd backend
mvn clean package
java -jar target/backend-0.0.1-SNAPSHOT.jar
```

### Frontend
```bash
cd frontend
npm run build
# Output will be in dist/ folder
```

## 🔐 Environment Variables

Create `.env` files for sensitive configuration:

### Backend (.env or application-prod.properties)
```
DB_HOST=localhost
DB_PORT=3306
DB_NAME=job_portal
DB_USERNAME=your_username
DB_PASSWORD=your_password
JWT_SECRET=your_jwt_secret
```

### Frontend (environment.ts)
```typescript
export const environment = {
  production: false,
  apiUrl: 'http://localhost:8080/api'
};
```

## 📚 Documentation

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Angular Documentation](https://angular.io/docs)
- [API Documentation](./docs/API.md) *(coming soon)*

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👥 Authors

- Your Name - *Initial work*

## 🙏 Acknowledgments

- Spring Boot community
- Angular community
- All contributors

## 📞 Support

For support, email support@jobportal.com or open an issue in the repository.

---

Made with ❤️ by [Your Name/Team]
