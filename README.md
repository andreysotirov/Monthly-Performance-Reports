# Monthly Performance Reports

Simple app that parse two json files to a csv using validation.

## JSON

Default path to JSON files is /json

If you want to change default path you can do it in DataReader.java or ReportReader.java at Line 17

For data-file:
```bash
 dataEntity = objectMapper.readValue(new File("json/data-file.json"), DataEntity.class);
```
For report-file:
```bash
 reportEntity = objectMapper.readValue(new File("json/report-definition.json"), ReportEntity.class);
```

You can add new sellers in data-file.json

And tweak the report definition in report-definition.json 

## CSV

CsvWriter.java is the class that is responsible to write data.csv. If you want to parse different JSON files to CSV
you'll may have to modify String[] header array on Line 20 

```bash
 String[] header = {"Name", "Score"};
```

and writer.writeAll on Line 23.

```bash
  writer.writeAll(scoreCalculator.calculateScore(), false);
```

Default path to CSV file is /csv

Default name is data.csv

## Usage

ScoreCalculator.java makes easy validation and calculations on which depends if the object will be written
to the CSV file.

## Libraries

Jackson-Databind

OpenCSV

Maven Project

