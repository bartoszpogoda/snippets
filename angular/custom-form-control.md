## Custom form control

```typescript
@Component
export class BaseControlValueAccessorComponent implements ControlValueAccessor {
    value = '';
    onChange = (v: any) => {};
    onTouch = (v: any) => {};
    disabled = false;

    writeValue(value: any): void {
        this.value = value;
    }

    registerOnChange(fn: any): void {
        this.onChange = fn;
    }

    registerOnTouch(fn: any): void {
        this.onTouch = fn;
    }

    // this one is optional
    setDisabledState(isDisabled: boolean): void {
        this.disabled = isDisabled;
    }
}

```

Then we have to imlplement ```writeValue(val: any): void``` field which would be invoked with current reactive form field value or bound ngModel value depending on component usage.

We should also implement ```registerOnChange(fn: any): void``` and save function that is passed and invoke it when our value is updated. Invoking this function will handle form specific emissions behind the scenes (valueChange or ngModelChange).

Remaining is ```registerOnTouched(fn: any): void``` and possibly ```setDisabledState(isDisabled: boolean): void```

