Apparently some fields do not have to have UI controls. It may be usefull if you want to have hidden state that is passed to form and then **patched, validated and emitted** along with the form.

```typescript

export class MyComponent {

    readonly idControlName = 'id';
    readonly nameControlName = 'name';

    myFormGroup: FormGroup;

    constructor() {
        this.myFormGroup = new FormGroup({
            [this.idControlName]: new FormControl(2, [Validators.required]),
            [this.nameControlName]: new FormControl('', [Validators.required])
        });

        // then we can for example
        this.myFormGroup.patchValue({
            id: 5,
            name: 'new name'
        });
    }
}

```