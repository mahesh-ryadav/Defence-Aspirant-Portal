# ExamPortal COMPLETE API Documentation (All Layers)

## **1. USER APIs (ExamController)**

### `GET /api/exams`
**Controller:** ExamController.getActiveExams()
**Service:** ExamServiceImpl.getActiveExams() → `examRepository.findByActiveTrue()`
**Returns:** `List<ExamDTO>`
```
[
  {
    "id": 1
