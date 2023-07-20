# chrono-scan

# Archive Digitization System

The Archive Digitization System is a project that aims to digitize physical documents, extract text content using OCR, generate document summaries, and generate keywords for efficient document retrieval.

## Features

- Document Ingestion: The main module built with Spring Boot handles document ingestion. It provides APIs for uploading and processing scanned documents, extracting text using OCR, and storing the digital copies.
- OCR (Optical Character Recognition): The Spring Boot module integrates OCR functionality to extract text from scanned images using libraries like Tesseract or Google Cloud Vision OCR.
- Document Summarization: The Python module handles document summarization and abstract generation. It utilizes NLP techniques, such as BART or custom algorithms, to generate concise summaries or abstracts from the extracted text.
- Keyword Generation: The Python module also generates keywords based on the document content using NLP libraries like NLTK or spaCy. These keywords are used for efficient document retrieval.
- Integration: The system allows integration with external services like document management systems or cloud storage providers through APIs.
- Scalable and Extensible: The architecture is designed to be scalable and extensible, allowing for easy integration of additional features or modules.

## Technology Stack

- Main Module (Document Ingestion and OCR):
  - Spring Boot: A Java framework for building web applications.
  - OCR Library/Service: Choose an OCR library or service, such as Tesseract or Google Cloud Vision OCR, for text extraction from scanned images.

- Python Module (Summarization and Keyword Generation):
  - Python: A programming language used for the document summarization and keyword generation module.
  - NLP Libraries: Utilize libraries like NLTK or spaCy for text processing, summarization, and keyword extraction.

## Setup and Configuration

1. Clone the repository:
  `git clone <repository_url>`
2. Main Module (Document Ingestion and OCR):
  - Install the necessary dependencies for the Spring Boot application.
  - Configure the OCR library/service integration and provide the required credentials or configurations.
  - Build and run the Spring Boot application.

3. Python Module (Summarization and Keyword Generation):
  - Install the required Python packages mentioned in the module.
  - Configure any necessary settings or API keys for NLP libraries.
  - Run the Python module.

## Usage

1. Document Ingestion:
  - Use the provided APIs to upload scanned documents.
  - The main module will process the uploaded documents, extract text using OCR, and store the digital copies.

2. Document Summarization and Keyword Generation:
  - Invoke the appropriate functions or APIs provided by the Python module to generate document summaries and keywords.
  - Pass the extracted text from the main module to the Python module for processing.

## Contributing

Contributions to the Archive Digitization System project are welcome! If you would like to contribute, please follow these steps:
- Fork the repository and create a new branch.
- Implement your changes or add new features.
- Submit a pull request detailing your changes and the problem they solve.

## License

This project is licensed under the [MIT License](LICENSE).

## Contact

For any inquiries or feedback, please contact Guy Guidona at mguidona@gmail.com.
