-- Create schema if it doesn't exist
CREATE SCHEMA IF NOT EXISTS dbo;

-- Create table
CREATE TABLE dbo.perfumes (
      id BIGINT PRIMARY KEY,
      perfumer VARCHAR(255)
);