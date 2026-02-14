# Mockito Assignment - Price Service Testing

Advanced Mockito testing with discount calculation service.

## Components

- **Discount**: Interface for discount repository
- **PriceService**: Calculates final price after discount
- **PriceServiceTest**: Comprehensive unit tests with Mockito

## Features

- @Mock and @InjectMocks annotations
- @ExtendWith(MockitoExtension.class) for JUnit 5
- Multiple test scenarios (MOB, LAP product codes)
- Exception handling tests
- Verify method invocations

## Test Cases

1. **MOB Product**: 10% discount on ₹1000 = ₹900
2. **LAP Product**: 20% discount on ₹2000 = ₹1600
3. **Exception Test**: Service unavailable scenario

## Run Tests

```bash
mvn test
```

## Key Concepts

- Dependency injection with Mockito
- when().thenReturn() stubbing
- when().thenThrow() for exceptions
- verify() for method call verification
- assertThrows() for exception testing
