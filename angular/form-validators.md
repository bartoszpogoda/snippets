
## Not blank
```typescript
private notBlankValidator(control: FormControl) {
    return (control.value || '').trim().length() === 0 ? { 'blank': true } : null;
}
```

