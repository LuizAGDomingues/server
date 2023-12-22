CREATE TABLE items(
    id TEXT PRIMARY KEY UNIQUE NOT NULL,
    name TEXT NOT NULL,
    description TEXT NOT NULL,
    image TEXT NOT NULL,
    value INTEGER NOT NULL,
    size TEXT NOT NULL,
    brand TEXT NOT NULL,
    gender TEXT NOT NULL,
    quantity INTEGER NOT NULL,
    ratio INTEGER NOT NULL
);