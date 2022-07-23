# React UI 

### Required Softwares 
* WebStorm / Visual Studio Code 
* Node + NPM 
* Chrome Browser or hmtm5 Compliant browser 


# Setting up Node JS
Step 1: Download the Node.js .msi Installer
[Download Node Js](https://nodejs.org/dist/v16.4.2/node-v16.4.2-x64.msi)  
Step 2: Run the Node.js Installer  
Step 3: Verify that Node.js was Properly installed
* node -v

Step 4: Update the Local npm Version
* npm install npm --global  
* npm start is a command which would run most of you react applications 


# Installing Create React App 
* npm i -g create-react-app  
* Check if the create-react-app is properly installed 


# Creating your first react app with typescript 
npx create-react-app my-app --template typescript

Check once the contents is created 
* Switch to the directory of your project 
* run npm start 
* run http://localhost:3000




# Example 01 Hello React

In this sample we will create our first react component and connect it with the DOM via react-dom.

We will take a startup point sample _00 Boilerplate_.

Summary steps:

- Install react and react-dom libraries.
- Install react and react-dom typescript definitions.
- Update the index.html to create a placeholder for the react components.
- Create a simple react component.
- Wire up this component by using react-dom.

## Prerequisites

Install [Node.js and npm](https://nodejs.org/en/) (v8.9.4 or higher) if they are not already installed on your computer.

> Verify that you are running at least node v8.x.x and npm 5.x.x by running `node -v` and `npm -v`
> in a terminal/console window. Older versions may produce errors.

## Steps to build it

- Copy the content of the `00 Boilerplate` folder to an empty folder for the sample.

- Install the npm packages described in the [./package.json](./package.json) and verify that it works:

```bash
npm install
```

- Install `react` and `react-dom` libraries as project dependencies.

```bash
npm install react react-dom --save
```

- Install also the typescript definitions for `react` and `react-dom`
  but as dev dependencies.

```bash
npm install @types/react @types/react-dom --save-dev
```

- Update the [./src/index.html](./src/index.html) to create a placeholder for the react components.

_[./src/index.html](./src/index.html)_

```diff
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title></title>
</head>
<body>
  <div class="well">
    <h1>Sample app</h1>
+   <div id="root"></div>
  </div>
</body>
</html>

```

- Create a simple react component (let's create it within a new file called `hello.tsx` in `src`folder).

_[./src/hello.tsx](./src/hello.tsx)_

```javascript
import * as React from "react";

export const HelloComponent = () => {
  return <h2>Hello component !</h2>;
};
```

- Wire up this component by using `react-dom` under [./src/index.tsx](./src/index.tsx) (we have to rename
  this file extension from `ts` to `tsx` and replace the content).

_[./src/index.tsx](./src/index.tsx)_

```diff
- document.write('Hello from index.ts!');

+ import * as React from 'react';
+ import * as ReactDOM from 'react-dom';

+ import { HelloComponent } from './hello';

+ ReactDOM.render(
+   <HelloComponent/>,
+   document.getElementById('root')
+ );
```

- Delete the file _main.ts_ we are not going to need it anymore.

- Modify the [./webpack.config.js](./webpack.config.js) file and change the entry point from `./main.ts`
  to `./index.tsx`.

_[./webpack.config.js](./webpack.config.js)_

```diff
...

module.exports = {
 context: path.join(basePath, 'src'),
 resolve: {
   extensions: ['.js', '.ts', '.tsx']
 },
 entry: ["@babel/polyfill", 
-  "./main.ts"],
+  "./index.tsx"],
  output: {
    path: path.join(basePath, "dist"),
    filename: "bundle.js"
  },
```

- Execute the example:

```bash
npm start
```


# Example 02 Properties

In this example we introduce a basic React concept: handling properties.

We add a _username_ property and display it in the _hello_ component.

We take as startup point the example **01 Hello React**:

### Summary steps:

- _hello_ stateless component: create a property to hold the _username_ value.
- Let's provide a value from our parent control.

## Prerequisites

Install [Node.js and npm](https://nodejs.org/en/) (v6.6.0 or higher) if they are not already installed on your computer.

> Verify that you are running at least node v6.x.x and npm 3.x.x by running `node -v` and `npm -v` in a terminal/console window. Older versions may produce errors.

## Steps to build it

- Copy the content from _01 HelloReact_ and execute:

  ```
  npm install
  ```

- Let's update _hello.tsx_ to add a new property (_userName_) and display it using interpolation (_{userName}_):

_./src/hello.tsx_

```diff
import * as React from 'react';

+ interface Props {
+  userName : string;
+ }

- export const HelloComponent = () => {
+ export const HelloComponent = (props: Props) => (
-  return (
-    <h2>Hello component !</h2>
+    <h2>Hello user: { props.userName } !</h2>
  );
- }
```

- Let's update _index.tsx_ and provide a value to the _userName_ property:

_./src/index.tsx_

```diff
  import * as React from 'react';
  import * as ReactDOM from 'react-dom';
  import { HelloComponent } from './hello';

  ReactDOM.render(
-    <HelloComponent />,
+    <HelloComponent userName="John" />,
    document.getElementById('root')
  );
```

- Let's test the sample:

```cmd
npm start
```

# Example 03 State

In this example we introduce a basic React concept: handling State.

In this scenario we provide a default username and let the user update it.

We take as a starting point the example _02 Properties_:

## Summary steps:

- Create an _App_ component that holds the state. This state will contain the current
  username (with default value "defaultUserName").
  This _App_ component renders the _Hello_ component. At first we create a simple stateless
  _App_ component.
- Update _index.tsx_ file to include our _App_ component.
- Change _App_ component to a stateful class component to hold the _userName_ state.
- Create a _NameEdit_ component to let the user change the value of username. This changes the _App_ state
  using a function from _App_.
- Check everything works properly.

## Prerequisites

Install [Node.js and npm](https://nodejs.org) if they are not already installed on your computer.

> Verify that you are running at least node v6.x.x and npm 3.x.x by running `node -v` and `npm -v` in a terminal/console window. Older versions may produce errors.

## Steps to build it

- Copy the content from _02 Properties_ and execute `npm install`.

- Let's create an _App_ component under a new file named _app.tsx_ (this component will display the _Hello_ component).

_./src/app.tsx_

```jsx
import * as React from "react";
import { HelloComponent } from "./hello";

export const App = () => {
  return <HelloComponent userName="John" />;
};
```

- Let's update _index.tsx_ just to use the _App_ component that we have just created.

_./src/index.tsx_

```diff
  import * as React from 'react';
  import * as ReactDOM from 'react-dom';
+ import { App } from './app';

- import { HelloComponent } from './hello';

  ReactDOM.render(
-    <HelloComponent userName="John" />,
+    <App />,
    document.getElementById('root')
  );
```

- Now we can check that things are still working as expected.

  ```
  npm start
  ```

- It's time to revisit _app.tsx_. We want to store the user's name and let the user updated it. We will use hooks to
  allow _App_ functional components to make use of state (this works in React 16.8.2 and above if you have to use
  older versions you have to use a class component, check the "old*classes_components" on the root of this repo for example).
  We will add \_userName* to the state.

Let's move this component to a class stateful component and define a state including _userName_, and pass this value to the _Hello_ component.

_./src/app.tsx_

```diff
import * as React from "react";

import { HelloComponent } from "./hello";

export const App = () => {
+ const [name, setName] = React.useState('defaultUserName');
-  return <HelloComponent userName="John" />;
+  return <HelloComponent userName={name} />;
};
```

- Again, we can do a quick check to test that everything works as expected.

```
npm start
```

- Now it's time to create an _NameEdit_ component. This component lets the user update his username and notifies with a callback to the parent control whenever the value of _userName_ gets updated.

_./src/nameEdit.tsx_

```jsx
import * as React from "react";

interface Props {
  userName: string;
  onChange: (e: React.ChangeEvent<HTMLInputElement>) => void;
}

export const NameEditComponent = (props: Props) => (
  <>
    <label>Update name:</label>
    <input value={props.userName} onChange={props.onChange} />
  </>
);
```

Side note: What is this Fragment or <> stuff? A way to create component that has multiple root elements (not a single parent). Available from React 16.2. As an alternative you can type:

```jsx
  ...
  export const NameEditComponent = (props : Props) =>
    <React.Fragment>
      <label>Update name:</label>
      <input value={props.userName}
             onChange={props.onChange}
      />
    </React.Fragment>
}
```

- In the _app.tsx_ file, let's add a function to replace the state value of _userName_ with the new one.

_./src/app.tsx_

```diff
import * as React from "react";
import { HelloComponent } from "./hello";
import { NameEditComponent } from './nameEdit';


export const App = () => {
  const [name, setName] = React.useState("defaultUserName");

+    const setUsernameState = (event: React.ChangeEvent<HTMLInputElement>) => {
+      setName(event.target.value);
+    }

- return <HelloComponent userName={name} />;
+      return (
+        <>
+          <HelloComponent userName={name} />
+          <NameEditComponent userName={name} onChange={setUsernameState} />
+        </>
+      );
};
```

- Finally let's test everything works once more.

  ```
  npm start
  ``` 


# Example 04 Callback + State

In this example we will refactor the previous **03 State** example.

We will update the name property only when the user clicks a _change_ button, and we will simplify the prop callback signature.

Obviously, we take the example **03 State** as a starting point.

## Summary steps:

- Add a button to the `EditName` component and a handler function for this.
- Submit the name only when the user clicks that button.
- Update the `app` component to handle the new simplified event.

## Prerequisites

Install [Node.js and npm](https://nodejs.org/en/) (v6.6.0 or higher) if they are not already installed on your computer.

> Verify that you are running at least node v6.x.x and npm 3.x.x by running `node -v` and `npm -v` in a terminal/console window. Older versions may produce errors.

## Steps to build it

- Copy the content of the `03 State` folder to an empty folder for this example and make this your current folder.

- Install the npm packages described in the `package.json` and verify that it works:

```bash
npm install
```

- Now we will start by keeping the temporary name being edited in state and notify the parent about the new name just
  when the user clicks on the _Change_ button. Initially we will store this temporary value in the _nameEdit_ component
  later on we will check that in some scenarios this is not an ideal solution, we will rollback and refactor.

_./src/nameEdit.tsx_

```diff
import * as React from "react";

interface Props {
-  userName: string;
-  onChange: (e : React.ChangeEvent<HTMLInputElement>) => void;
+  initialUserName: string;
+  onNameUpdated: (newName: string) => any;
}

- export const NameEditComponent = (props: Props) => (
+ export const NameEditComponent = (props: Props) => {
+  const [editingName, setEditingName] = React.useState(props.initialUserName);
+
+  const onChange = (e : React.ChangeEvent<HTMLInputElement>) => {
+    setEditingName(e.target.value);
+  }
+
+ const onNameSubmit = (event: any): any => {
+   props.onNameUpdated(editingName);
+ }
+
+ return (
    <>
      <label>Update name:</label>
-      <input value={props.userName} onChange={props.onChange} />
+      <input value={editingName} onChange={onChange} />
+      <button onClick={onNameSubmit}>Change</button>
    </>
+ )
- );
+ }
```

- Let's wire this up in the `app.tsx` file.

_./src/app.tsx_

```diff
import * as React from "react";
import { HelloComponent } from "./hello";
import { NameEditComponent } from "./nameEdit";

export const App = () => {
  const [name, setName] = React.useState("defaultUserName");

-  const setUsernameState = (event: React.ChangeEvent<HTMLInputElement>) => {
-    setName(event.target.value);
-  };
+  const setUsernameState = (newName : string) => {
+    setName(newName);
+  };

  return (
    <>
      <HelloComponent userName={name} />
-      <NameEditComponent userName={name} onChange={setUsernameState} />
+      <NameEditComponent initialUserName={name} onNameUpdated={setUsernameState} />
    </>
  );
};
```

Now we've got a clear event, strongly typed and simplified (as it is more straightforward).

- Let's give it a try:

  ```bash
  npm start
  ```



# Example 05 Refactor

In the previous example we set an initial username value. What happens if we expect this value to come from e.g. an AJAX request or if it could change in time? The current approach doesn't work.

# Steps

- We will start from sample 04, let's copy the content and install the packages.

```bash
npm start
```

- Let's simulate an asynchronous call (we will use setTimeout).

_./src/app.tsx_

```diff
import * as React from "react";
import { HelloComponent } from "./hello";
import { NameEditComponent } from "./nameEdit";


export const App = () => {
  const [name, setName] = React.useState("defaultUserName");

+  const loadUsername = () => {
+    setTimeout(() => {
+      setName("name from async call");
+    }, 500);
+  };
+
+  React.useEffect(() => {
+    loadUsername();
+  },
+  []);

  const setUsernameState = (newName : string) => {
    setName(newName);
  };

  return (
    <>
      <HelloComponent userName={name} />
      <NameEditComponent initialUserName={name} onNameUpdated={setUsernameState} />
    </>
  );
};
```

If we run the application we can check that the label showing the name is being updated, but not
the name edit input, why this behavior? NameEdit only reads the parent prop when the state is initialized.
We need a wait to get prop value to refresh the child component when it changes, we are facing a state governance
issue, who's your daddy? Parent and child components have the right to update that entry.

We can think about two possible solutions:

- If we come from the traditional component mindset, we can try to make this fit into the React model we could: Store the very first _initialName_ check if the parent prop got an update on the _initialName_, then update the editing name.

- The second solutions (recommended one) need you to change a bit your mindset, if we have two components fighting
  for an state update, why not lifting it up? Parent component will hold the editing name, child component will
  request an update via callback, by following this approach:

  - The child components remains as pure presentational.
  - You have only one place where the updates is being done, and you have control over it, you could easily change behavior
    e.g. if the user has already started typing the name then ignore the ajax call.

We will stick with the second approach in the rest of examples, but we encourage you to go through both approaches as
a learning excercise.

## First approach

If we were using class based components, the first approach to try is to keep the _editingName_
information in the state in the child component, we can reset this state if the parent property changes, we need to make some changes:

- In one hand we need to hold in the state the original _initialName_.
- In the other hand in the render phase check if _initialName_ from props is different
  to _initialName_ from state then update it (more info about this approach: https://reactjs.org/docs/hooks-faq.html#how-do-i-implement-getderivedstatefromprops).

Let's go for it:

_./src/nameEdit.tsx_

```diff
interface Props {
  initialUserName: string;
  onNameUpdated: (newName: string) => any;
}

export const NameEditComponent = (props: Props) => {
  const [editingName, setEditingName] = React.useState(props.initialUserName);
+ const [lastInitialName, setLastInitialName] = React.useState(props.initialUserName);

  const onChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    setEditingName(e.target.value);
  };

  const onNameSubmit = (event: any): any => {
    props.onNameUpdated(editingName);
  };

+ if(props.initialUserName !== lastInitialName) {
+    setLastInitialName(props.initialUserName);
+    setEditingName(props.initialUserName);
+ }

  return (
    <>
      <label>Update name:</label>
      <input value={editingName} onChange={onChange} />
      <button onClick={onNameSubmit}>Change</button>
    </>
  );
};
```

## Second approach

The first approach was fine if we come from a Java / C# mindset, but it has it drawbacks
what would happen if we want the editingName to be preserved if it has changed (async call
would have no effect then)? When there is a conflict updating the state between parent and child
a valid solution is to lift up that part of the state to the parent component, if we follow
this approach we can end up having the core state isolated in container components (prior step
to build redux on top of it).

Let's see how can we lift up this state:

_./src/app.tsx_

```diff
export const App = () => {
  const [name, setName] = React.useState("defaultUserName");
+ const [editingName, setEditingName] = React.useState("defaultUserName");

  const loadUsername = () => {
    setTimeout(() => {
      setName("name from async call");
+     setEditingName("name from async call");
    }, 500);
  };

  React.useEffect(() => {
    loadUsername();
  },
  []);

-  const setUsernameState = (newName: string) => {
+  const setUsernameState = () => {
-    setName(newName);
+    setName(editingName);
  };

  return (
    <>
      <HelloComponent userName={name} />
      <NameEditComponent
        initialUserName={name}
+       editingName={editingName}
        onNameUpdated={setUsernameState}
+       onEditingNameUpdated={setEditingName}
      />
    </>
  );
};
```

- Now let's jump into _NameEditComponent_ and update the contract and
  implementation:

```diff
interface Props {
  initialUserName: string;
+   editingName: string;
-  onNameUpdated: (newName: string) => any;
+  onNameUpdated: () => any;
+   onEditingNameUpdated: (newEditingName: string) => any;
}
```

```diff
export const NameEditComponent = (props: Props) => {
-  const [editingName, setEditingName] = React.useState(props.initialUserName);

  const onChange = (e: React.ChangeEvent<HTMLInputElement>) => {
-    setEditingName(e.target.value);
+    props.onEditingNameUpdated(e.target.value);
  };

  const onNameSubmit = (event: any): any => {
-    props.onNameUpdated(editingName);
+   props.onNameUpdated();
  };

- if(props.initialUserName !== lastInitialName) {
-    setLastInitialName(props.initialUserName);
-    setEditingName(props.initialUserName);
- }


  return (
    <>
      <label>Update name:</label>
-      <input value={editingName} onChange={onChange} />
+      <input value={props.editingName} onChange={onChange} />
      <button onClick={onNameSubmit}>Change</button>
    </>
  );
};
```

# Example 06 Enable

Let's continue with the update name sample, this time we want to disable the
"update" button when the input is empty or when the value hasn't changed.

We will take as startup point sample _05 Refactor_

## Summary steps:

- Add a condition to disable the button when the editingName is empty.

- Think about how to disable the button when the editingName is not equal
  the final name.

## Steps to build it

- Copy the content from _05 Refactor_.

- Let's install the packages.

```bash
npm install
```

- Let's start by adding a condition to disable the field whenever is empty.

_./src/nameEdit.tsx_

```diff
  return (
    <>
      <label>Update name:</label>
      <input value={props.editingName} onChange={onChange} />
-      <button onClick={onNameSubmit}>Change</button>
+      <button onClick={onNameSubmit}
+         disabled={props.editingName === ''}
+      >Change</button>

    </>
  );
```

- That was nice, let's go one step further, now we want to disable the button when
  the editingName is empty and when the editing name is the same as the finalname, how
  could we do that? We can choose between two options here:

  - [Excercise] Add to the disabled option one more condition and cover the case where
    the editingName is equal to the initialName.

  - Create a generic disable property on the NameEditComponent and let the parent control
    decide in which cases it should be disabled (thanks to [Victor Borrego](https://github.com/v-borrego) to point out this great solution).

We will follow the second approach since is the one that can provide more flexibility to the
control (in a real project, choosing between one approach or the other depends on specification details).

We will expose a _disabled_ property in the _NameEdit_ component.

_./src/nameEdit.tsx_

```diff
interface Props {
  initialUserName: string;
  editingName: string;
  onNameUpdated: () => any;
  onEditingNameUpdated: (newEditingName: string) => any;
+ disabled : boolean;
}
```

_./src/nameEdit.tsx_

```diff
  <button
    onClick={onNameSubmit}
-    disabled={props.editingName === ''}
+    disabled={props.disabled}
  >Change</button>
```

- Now in the _app_ component we will define the condition to enable/disable the component.

```diff
      <NameEditComponent
        initialUserName={name}
        editingName={editingName}
        onNameUpdated={setUsernameState}
        onEditingNameUpdated={setEditingName}
+        disabled={editingName === '' || editingName === name}
      />
```

- Let's give a try

```
npm start
```

# Excercise

Ideas to further implement this, let's convert our NameEdit component to a password
strength component:

- Extract the disabled condition to function.
- Add one more validation, text should contain at least a number, one letter upper case,
  and one special character (.,@,\_).
- Display in a label the condition that is not passing.
- Display in a label all the conditions that are not passing.
- Create a password strenght indicator (you can do it just showing plain text
  in future samples we will teach you how to interact with CSS and you will
  be able to display a color bar indicating password strength).



# Example 07 Colopicker

In this sample we are going to implement a color picker component, it will allow us to choose between red / green / blue components and display the resulting color.

We will start with a non optimal implementation and we will refactor it in sample 08.

# Steps

- We will take as starting point sample _06 Enable_, copy the content from that project and
  execute _npm install_

```bash
npm install
```

- The current project structure is getting a bit cluttered, let's do some quick organization.

- We will create a components folder under _src_ (_src/components_).

- Inside that components folder we will copy all the components that we have created (_nameEdit.tsx_
  and _hello.tsx_).

- We will create an _index_ file under _src/components_ and create a barrel (by doing this, later
  on we can refactor the content of the components folder without affecting other external files in
  the application that may import them).

_./src/components/index.tsx_

```typescript
export * from "./hello";
export * from "./nameEdit";
```

- A color is composed by it's Red, Green and Blue values, we are going to define an entity that
  will have that structure.

_./src/model/color.ts_

```typescript
export interface Color {
  red: number;
  green: number;
  blue: number;
}
```

- Let's start by creating a _ColorBrowser_ component: this color will just display the
  selected color (under the hood is just a div, by applying css styling we provide a width
  and height to that rectangle, and a background color).

_./src/components/colorBrowser.tsx_

```typescript
import * as React from "react";
import { Color } from "../model/color";

interface Props {
  color: Color;
}

export const ColorBrowser = (props: Props) => {
  const divStyle: React.CSSProperties = {
    width: "11rem",
    height: "7rem",
    backgroundColor: `rgb(${props.color.red},${props.color.green}, ${
      props.color.blue
    })`
  };

  return <div style={divStyle} />;
};
```

- Let's add this component to our barrel definition.

_./src/components/index.ts_

```diff
export * from "./hello";
export * from "./nameEdit";
+ export * from './colorBrowser';
```

- Now let's refactor the components imports that we were consuming on the
  _app.tsx_ file.

```diff
import * as React from "react";
- import { HelloComponent } from "./hello";
- import { NameEditComponent } from "./nameEdit";
+ import { HelloComponent, NameEditComponent, ColorBrowser} from './components';
```

- Let's include color information in our _application_ component.

_./src/app.tsx_

```diff
+ import {Color} from './model/color';

// (...)

export const App = () => {
  const [name, setName] = React.useState("defaultUserName");
  const [editingName, setEditingName] = React.useState("defaultUserName");
+ const [color, setColor] = React.useState<Color>({red: 20, green: 40, blue: 180})
```

> We should consider here whether makes sense to group states, or even in more complex
> cases use reducer / action approach (hooks).

- Let's use the color browser to display that info.

_./src/app.tsx_

```diff
  return (
    <>
+      <ColorBrowser color={color}/>
      <HelloComponent userName={name} />

```

- Let's give a try and see our _ColorBrowser_ in action.

```bash
npm start
```

- We want to add color picker editing capabilities, let's create a color picker component
  and add a single slider for one of the color values.

_./src/components/colorpicker.tsx_

```typescript
import * as React from "react";
import { Color } from "../model/color";

interface Props {
  color: Color;
  onColorUpdated: (color: Color) => void;
}

export const ColorPicker = (props: Props) => (
  <div>
    <input
      type="range"
      min="0"
      max="255"
      value={props.color.red}
      onChange={event =>
        props.onColorUpdated({
          red: +event.target.value,
          green: props.color.green,
          blue: props.color.blue
        })
      }
    />
    {props.color.red}
  </div>
);
```

- Let's register this component in our barrel.

_./src/components/index.ts_

```diff
export * from "./hello";
export * from "./nameEdit";
export * from './colorBrowser';
+ export * from './colorPicker';
```

- Let's add this component to our import statement in the _app_ file.

_./src/app.tsx_

```diff
import * as React from "react";
- import { HelloComponent, NameEditComponent, ColorBrowser } from "./components";
+ import { HelloComponent, NameEditComponent, ColorBrowser, ColorPicker } from "./components";
import { Color } from "./model/color";
```

- Let's use the _ColorPicker_ in our _app_ component.

```diff
  return (
    <>
      <ColorBrowser color={color} />
+     <ColorPicker color={color} onColorUpdated={setColor}/>
```

- Let's give a try:

```bash
npm start
```

- Now we can apply the same approach for the green and blue component, we will start
  with a dirty implementation (copying & pasting the code from the red slider and updating
  it for the green and blue sliders), this approach will create a poor ColorPicker component
  (but a working one), in the next sample (08) we will refactor this to obtain a more
  maintanable component.

_./src/components/colorpicker.ts_

```diff
export const ColorPicker = (props: Props) => (
  <div>
    <input
      type="range"
      min="0"
      max="255"
      value={props.color.red}
      onChange={event =>
        props.onColorUpdated({
          red: +event.target.value,
          green: props.color.green,
          blue: props.color.blue
        })
      }
    />
    {props.color.red}
+        <br />
+        <input type="range"
+               min="0"
+               max="255"
+               value={props.color.green}
+               onChange={(event : any) => props.onColorUpdated(
+                 {
+                   red:  props.color.red,
+                   green: +event.target.value,
+                   blue: props.color.blue
+                 }
+               )}
+        />
+        {props.color.green}
+        <br />
+        <input type="range"
+               min="0"
+               max="255"
+               value={props.color.blue}
+               onChange={(event : any) => props.onColorUpdated(
+                 {
+                   red:   props.color.red,
+                   green: props.color.green,
+                   blue: +event.target.value
+                 }
+               )}
+        />
+        {props.color.blue}
+        <br />
  </div>
);
```

- Let's give a try and check the results:

```bash
npm start
```


# Example 09 Sidebar

In this example we are going to add a sidebar to our application, we will start with a specific
implementation, then we will make it generic.

# Steps

- We will take as starting point sample _08 ColorPickerRefactor_, let's copy the content
  from that file and execute _npm install_.

```bash
npm install
```

- Create a file called _src/components/sidebar.css_ and add the following styles (http://www.w3schools.com/howto/howto_js_sidenav.asp):

_./src/components/sidebar.css_

```css
/* The side navigation menu */
.sidenav {
  height: 100%; /* 100% Full-height */
  width: 0; /* 0 width - change this with JavaScript */
  position: fixed; /* Stay in place */
  z-index: 1; /* Stay on top */
  top: 0;
  left: 0;
  background-color: #808080; /* Gray*/
  overflow-x: hidden; /* Disable horizontal scroll */
  padding-top: 60px; /* Place content 60px from the top */
  transition: 0.5s; /* 0.5 second transition effect to slide in the sidenav */
}

/* Position and style the close button (top right corner) */
.sidenav .closebtn {
  position: absolute;
  top: 0;
  right: 25px;
  font-size: 36px;
  margin-left: 50px;
}

/* Style page content - use this if you want to push the page content to the right when you open the side navigation */
#main {
  transition: margin-left 0.5s;
  padding: 20px;
}

/* On smaller screens, where height is less than 450px, change the style of the sidenav (less padding and a smaller font size) */
@media screen and (max-height: 450px) {
  .sidenav {
    padding-top: 15px;
  }
  .sidenav a {
    font-size: 18px;
  }
}
```

- We are going to use CSS Modules, so let's configure it.

_./webpack.config.js_

```diff
  module.exports = {
    context: path.join(basePath, "src"),
    resolve: {
-      extensions: ['.js', '.ts', '.tsx']
+      extensions: ['.js', '.ts', '.tsx', '.css']
    },
```

- We will only use CSS Modules for custom app stylesheets. We will not use CSS Modules for other CSS files, like Bootstrap (folder node_modules).

_./webpack.config.js_

```diff
  {
    test: /\.css$/,
+   include: /node_modules/,
    use: [MiniCssExtractPlugin.loader, "css-loader"]
  },
+  // Use CSS modules for custom stylesheets
+  {
+    test: /\.css$/,
+    exclude: /node_modules/,
+    use: [
+        MiniCssExtractPlugin.loader,
+        {
+          loader: 'css-loader',
+          options: {
+            modules: {
+              localIdentName: "[name]__[local]___[hash:base64:5]",
+            },
+            localsConvention: "camelCase",
+          },
+        },
+      ]
+  },
+  // Do not use CSS modules in node_modules folder

```

- We are going to create now a sidebar component, _src/components/sidebar.tsx_. Right now we will create just
  a rectangle and we will interact with the animation.

We need to install node typings, since we are going to make use of _require_ to import from
the _css_.

```bash
npm install @types/node --save-dev
```

_./src/components/sidebar.tsx_

```jsx
import * as React from "react";

const classNames = require("./sidebar.css");

export const SidebarComponent = () => (
  <div id="mySidenav" className={classNames.sidenav}>
    <span>Basic side bar, first steps</span>
  </div>
);
```

- Let's add this component to the _index_ barrel.

_./src/components/index.ts_

```diff
export * from "./hello";
export * from "./nameEdit";
export * from "./colorBrowser";
export * from "./colorPicker";
+ export * from "./sidebar";
```

- We are going to add a known id to the body section of _src/index.html_ page

_./src/index.html_

```diff
-  <body>
+  <body id="main">
```

- Let's place the component adding it into the `app.tsx`:

_./src/app.tsx_

```diff
import * as React from "react";
- import { HelloComponent, NameEditComponent, ColorBrowser, ColorPicker } from "./components";
+ import { HelloComponent, NameEditComponent, ColorBrowser, ColorPicker, SidebarComponent } from "./components";
import { Color } from "./model/color";
```

_./src/app.tsx_

```diff
  return (
    <>
+      <SidebarComponent />
      <ColorBrowser color={color} />
```

- Let's start with the interesting part of this implementation, let's add a flag to show/hide the
  sidebar _sidebar.tsx_.

_./src/components/sidebar.tsx_

```diff
import * as React from 'react';

const classNames = require('./sidebar.css');

+ interface Props {
+  isVisible: boolean;
+ }

- export const SidebarComponent = () =>
+ export const SidebarComponent = (props: Props) =>
    <div id="mySidenav" className={classNames.sidenav}>
        <span>Basic sidebar, first steps</span>
    </div>
```

- Now let's add some logic to show / hide the sidebar in case the flag gets updated

_./src/sidebar.tsx_

```diff
import * as React from 'react';

const classNames = require('./sidebar.css');

interface Props {
  isVisible: boolean;
};

+    const divStyle = (props: Props): React.CSSProperties => ({
+      width: (props.isVisible) ? '23rem' : '0rem'
+    });

export const SidebarComponent = (props: Props) =>
-    <div id="mySidenav" className={classNames.sidenav}>
+    <div id="mySidenav" className={classNames.sidenav}
+      style={divStyle(props)}
+    >
        <span>Basic sidebar, first steps</span>
    </div>
```

- Let's make a quick test, we will show always the side bar:

_./src/app.tsx_

```diff
 return (
    <>
-      <SidebarComponent />
+      <SidebarComponent isVisible={true}/>
      <ColorBrowser color={color} />
```

- If we start the project we should now see the sidebar that we have created (a gray rectangle).

```bash
npm start
```

_What if I cannot see the sidebar?_ Check that your styles and webpackconfig has been applied,
you may need to start and top webpack-dev-sever (relaunch _npm \_start_), check with dev tools
that you are loading the CSS styles.

- Now at app level we can remember the visible status and add a button to toggle the
  visibility of the sidebar.

_./src/app.tsx_

```diff
export const App = () => {
  const [name, setName] = React.useState("defaultUserName");
  const [editingName, setEditingName] = React.useState("defaultUserName");
  const [color, setColor] = React.useState<Color>({
    red: 20,
    green: 40,
    blue: 180
  });
+ const[isVisible, setVisible] = React.useState(false);
```

_./src/app.tsx_

```diff
  return (
    <>
-      <SidebarComponent isVisible={true} />
+      <SidebarComponent isVisible={isVisible} />
      <ColorBrowser color={color} />
      <ColorPicker color={color} onColorUpdated={setColor} />
      <HelloComponent userName={name} />
      <NameEditComponent
        initialUserName={name}
        editingName={editingName}
        onNameUpdated={setUsernameState}
        onEditingNameUpdated={setEditingName}
        disabled={editingName === "" || editingName === name}
      />
+       <div style={{float: 'right'}}>
+         <button
+           onClick={() => setVisible(!isVisible)}>
+           Toggle Sidebar
+         </button>
+       </div>
    </>
```

- Let's start the application to check how it behaves:

```bash
npm start
```

> Excercise: the inline call to the function in _onClick_ is not considered a
> good pratice (on each render the function will be recreated), let's refactor this in two
> steps:

- First we will extract this logic to a function, we will call it _toggleSidebarVisibility_.
- Then let's wrap visibility + toggleSidebarVisibility in a custom hook.

* So far so good, but what happens if we want to make this sidebar a reusable component? We could just show the frame but the content should be dynamic.

* Let's start by adding some content when instantiating the sidebar (_app.tsx_).

_./src/app.tsx_

```diff
    <>
-      <SidebarComponent isVisible={isVisible} />
+      <SidebarComponent isVisible={isVisible}>
+        <h1>Cool Scfi movies</h1>
+          <ul>
+            <li><a href="https://www.imdb.com/title/tt0816692/">Interstellar</a></li>
+            <li><a href="https://www.imdb.com/title/tt0083658/">Blade Runner</a></li>
+            <li><a href="https://www.imdb.com/title/tt0062622/">2001: a space odyssey</a></li>
+         </ul>
+      </SidebarComponent>
      <ColorBrowser color={color} />
```

> We got an error, _children_ is not defined, that's something we are going to fix in the
> next step...

- Now in the _sidebar.tsx_ let's dump this content by using {this.props.children}

_./src/components/sidebar.tsx_

```diff
- export const SidebarComponent = (props: Props) => (
+ export const SidebarComponent: React.StatelessComponent<Props> = (props)  => (

  <div id="mySidenav" className={classNames.sidenav} style={divStyle(props)}>
-    <span>Basic side bar, first steps</span>
+    {props.children}
  </div>
);
```

- Let's try the sample

```
npm start
```

# Example 10 Table Data  with Reacts

In this sample we are going to show a table with mock data.

We will simulate that this method is calling an ajax api (it will return a promise),
by doing this we can check how easy is to replace it by a real call in the next
example.

# Steps to reproduce the sample

- We will take as starting point sample _09 sidebar_, let's copy the content from this
  sample and execute _npm install_.

```bash
npm install
```

- Let's define a model entity in _src/model/member.ts_:

_./src/model/member.ts_

```javascript
export interface MemberEntity {
  id: number;
  login: string;
  avatar_url: string;
}
```

> Excercise: model is starting to grow, couldn't it be a good idea to add a barrel _index_ file
> under the _model_ folder, let's do that.

- Let's create our fake api.

_./src/api/memberApi.ts_

```typescript
import { MemberEntity } from "../model/member";

export const getMembersCollection = (): Promise<MemberEntity[]> => {
  const promise = new Promise<MemberEntity[]>((resolve, reject) => {
    setTimeout(
      () =>
        resolve([
          {
            id: 1457912,
            login: "brauliodiez",
            avatar_url: "https://avatars.githubusercontent.com/u/1457912?v=3"
          },
          {
            id: 4374977,
            login: "Nasdan",
            avatar_url: "https://avatars.githubusercontent.com/u/4374977?v=3"
          }
        ]),
      500
    );
  });

  return promise;
};
```

> Using promises means you are going to use ES6 or you are going to include a
> polyfill to provide compatibility on ES5 (need to install the polifyll and
> include it your webpack entry point).

- Let's jump into the ui side, to create the table component we are going to follow
  a progressive approach:

1. Create the table component but just only display the names of the members that we
   get back.
2. Create the table itself, it would look a bit messy.
3. Time to refactor, let's create a row component that will hold the row element,
   and check if it's worth to break into a header and body component.
4. Excercise: Some developer preffer to create this child components as function
   method in the main component, to avoid having a mess of properties, do you think
   is a good idea? Try to give a try and check the pros and cons.

- Let's create our first version of _memberTableComponent_.

_./src/components/memberTable.tsx_

```tsx
import * as React from "react";
import { MemberEntity } from "../model/member";
import { getMembersCollection } from "../api/memberApi";

const useMemberCollection = () => {
  const [memberCollection, setMemberCollection] = React.useState<
    MemberEntity[]
  >([]);

  const loadMemberCollection = () => {
    getMembersCollection().then(memberCollection =>
      setMemberCollection(memberCollection)
    );
  };

  return { memberCollection, loadMemberCollection };
};

export const MemberTableComponent = () => {
  const { memberCollection, loadMemberCollection } = useMemberCollection();

  React.useEffect(() => {
    loadMemberCollection();
  }, []);

  return (
    <>
      {memberCollection.map(member => (
        <h1 key={member.id}>{member.login}</h1>
      ))}
    </>
  );
};
```

In this component we are doing many things:

- First we have created a custom hook to encapsulate the getter to memberCollection and
  the loadMemberCollection call to the api, by doing this code is more maintenable plus
  is a potential effect to be reused in other components.

- We just use the custom hook that we have create in the component.

- To invoke the loadMemberCollection on a similar event as _componentDidMount_
  we invoke _React.useEffect_ passing as a second parameter and empty array _[]_
  we are telling react only to execute this effect when the component is mounted
  (if not it would call on each update), from the React hooks docs:

https://reactjs.org/docs/hooks-effect.html

_If you want to run an effect and clean it up only once (on mount and unmount), you can pass an empty array ([]) as a second argument. This tells React that your effect doesn’t depend on any values from props or state, so it never needs to re-run. This isn’t handled as a special case — it follows directly from how the inputs array always works. While passing [] is closer to the familiar componentDidMount and componentWillUnmount mental model, we suggest not making it a habit because it often leads to bugs, as discussed above. Don’t forget that React defers running useEffect until after the browser has painted, so doing extra work is less of a problem._

- Let's include it in the components barrel.

_./src/components/index.ts_

```diff
export * from "./hello";
export * from "./nameEdit";
export * from "./colorBrowser";
export * from "./colorPicker";
export * from "./sidebar";
+ export * from './memberTable';
```

- Let's instantiate this component into the app:

First we import it

```diff
import * as React from "react";
import {
  HelloComponent,
  NameEditComponent,
  ColorBrowser,
  ColorPicker,
-  SidebarComponent
+  SidebarComponent,
+  MemberTableComponent,
} from "./components";
import { Color } from "./model/color";

```

Then add it to the markup section

_./src/app.tsx_

```diff
  return (
    <>
      <SidebarComponent isVisible={isVisible}>
        <h1>Cool Scfi movies</h1>
        <ul>
          <li>
            <a href="https://www.imdb.com/title/tt0816692/">Interstellar</a>
          </li>
          <li>
            <a href="https://www.imdb.com/title/tt0083658/">Blade Runner</a>
          </li>
          <li>
            <a href="https://www.imdb.com/title/tt0062622/">
              2001: a space odyssey
            </a>
          </li>
        </ul>
      </SidebarComponent>
+     <MemberTableComponent/>
      <ColorBrowser color={color} />
      <ColorPicker color={color} onColorUpdated={setColor} />
```

- Let's run the application and check that we are getting the list of member names.

```bash
npm start
```

- Time to start building our table layout, first iteration.

_./src/components/memberTable.tsx_

```diff
  return (
    <>
+      <table>
+        <thead>
+    <tr>
+        <th>
+            Avatar
+        </th>
+        <th>
+            Id
+        </th>
+        <th>
+            Name
+        </th>
+    </tr>
+        </thead>
+        <tbody>
      {memberCollection.map(member => (
-        <h1 key={member.id}>{member.login}</h1>
+        <tr>
+          <td>
+            <img src={member.avatar_url} style ={{maxWidth: '10rem'}}/>
+          </td>
+          <td>
+            <span>{member.id}</span>
+          </td>
+          <td>
+            <span>{member.login}</span>
+          </td>
+        </tr>
      ))}
+       </tbody>
+     </table>
    </>
  );

```

- If we run the application we can check that the table is displayed, but... the code
  is hard to read.

```bash
npm start
```

- Let's componentize this, we could create a _MemberRowComponent_

_./src/components/memberTable.tsx_

```diff
  return (
    <>
      <table>
        <thead>
          <tr>
            <th>Avatar</th>
            <th>Id</th>
            <th>Name</th>
          </tr>
        </thead>
        <tbody>
          {memberCollection.map(member => (
+            <MemberRow key={member.id} member={member}/>
-            <tr>
-              <td>
-                <img src={member.avatar_url} style={{ maxWidth: "10rem" }} />
-              </td>
-              <td>
-                <span>{member.id}</span>
-              </td>
-              <td>
-                <span>{member.login}</span>
-              </td>
-            </tr>
          ))}
        </tbody>
      </table>
    </>
  );
};

+ const MemberRow = ({member} : {member : MemberEntity}) =>
+        <tr>
+          <td>
+            <img src={member.avatar_url} style={{ maxWidth: "10rem" }} />
+          </td>
+          <td>
+            <span>{member.id}</span>
+          </td>
+          <td>
+            <span>{member.login}</span>
+          </td>
+        </tr>
```




# Example 12 React Router

In this sample we will start using React-Router (<acronym title="Single Page Application">SPA</acronym> navigation).

We take as a starting point the example _03 State_:

## Steps

- Copy the content from _03 State_ and execute `npm install`.

```bash
npm install
```

- Let's make some cleanup (remove _src/hello.tsx_ and _src/nameEdit.tsx_ files).

- Let's create a component called _PageA_ as _src/pages/pageA.tsx_:

_./src/pages/pageA.tsx_

```jsx
import * as React from "react"

export const PageA = () =>
    <div>
      <h2>Hello from page A</h2>
    </div>
```

- Let's create a component called _PageB_ as _src/pages/pageB.tsx_:

_./src/pages/pageB.tsx_

```jsx
import * as React from "react"

export const PageB = () =>
    <div>
      <h2>Hello from page B</h2>
    </div>
```

- Let's install the dependencies [`react-router-dom`](https://github.com/ReactTraining/react-router) and typescript definitions for this.

```bash
npm install react-router-dom --save
npm install @types/react-router-dom --save-dev
```

- Let's define the routing in _app.tsx_:

_./src/app.tsx_

```diff
import * as React from 'react';
import * as ReactDOM from 'react-dom';
- import { HelloComponent } from './hello';
- import { NameEditComponent } from './nameEdit';
+ import { HashRouter, Switch, Route } from 'react-router-dom';
+ import { PageA } from './pages/pageA';
+ import { PageB } from './pages/pageB';

export const App = () => {
- const [name, setName] = React.useState("initialName");

- const setUsernameState = (event: React.ChangeEvent<HTMLInputElement>) => {
-    setName(event.target.value);
-  };
  return (
    <>
-     <HelloComponent userName={name} />
-     <NameEditComponent userName={name} onChange={setUsernameState} />
+     <HashRouter>
+       <Switch>
+         <Route exact={true} path="/" component={PageA} />
+         <Route path="/pageB" component={PageB} />
+       </Switch>
+     </HashRouter>,
    </>
);

```

- It's time to check that we are following the right track:

```bash
npm start
```

- Let's define a navigation from _[PageA.tsx](./src/pageA.tsx)_ to _[PageB.tsx](./src/pageB.tsx)_.

_./src/pages/pageA.tsx_

```diff
import * as React from "react"
+ import { Link } from 'react-router-dom';

export const PageA = () =>
    <div>
      <h2>Hello from page A</h2>
+     <br />
+     <Link to="/pageB">Navigate to Page B</Link>
    </div>
```

- Let's define a navigation from _[PageB.tsx](./src/pageB.tsx)_ to _[PageA.tsx](./src/pageA.tsx)_

_./src/pages/pageB.tsx_

```diff
import * as React from "react"
+ import { Link } from 'react-router-dom';

export const PageB = () =>
    <div>
      <h2>Hello from page B</h2>
+     <br />
+     <Link to="/">Navigate to Page A</Link>
    </div>
```


- Let's run the app and check that the navigation links are working

```bash
npm start
```


# Example 13 Login Form using React

In this sample we are going to implement a basic login page, that will redirect the user to another page whenever the login has completed successfully.

We will attempt to create a realistic layout, in order to keep simplicity we will break it into subcomponents and perform some refactor in order to make the solution more maintainable.

We will take a starting point the sample 12 ReactRouter:

## Steps

- Copy the content from _12 ReactRouter_ and execute `npm install`.

```bash
npm install
```

- Let's rename _pageA.tsx_ to _loginPage.tsx_.

- Let's update as well the name of the component.

_./src/pages/login.component.tsx_

```diff
import * as React from "react";
import { Link } from "react-router-dom";

- export const PageA = () => (
+ export const LoginComponent: React.FC<PropsForm> = (props) => {
    <div>
-     <h2>Hello from page A</h2>
+     <h2> Hello from login Page</h2>
      <br />
      <Link to="/pageB">Navigate to Page B</Link>
    </div>
  );
```

- Let's update _app.tsx_ (routes, names and add a redirect from root to login page).

_./src/app.tsx_

```diff
import * as React from "react";
import { HashRouter, Switch, Route } from "react-router-dom";
- import { PageA } from "./pages/pageA";
+ import { LoginComponent } from "./pages/login.component";
import { PageB } from "./pages/pageB";

export const App = () => {

  return (
    <>
      <HashRouter>
        <Switch>
-         <Route exact={true} path="/" component={PageA} />
+         <Route exact={true} path="/" component={LoginComponent} />
          <Route path="/pageB" component={PageB} />
        </Switch>
      </HashRouter>
    </>
  );
};
```

- Let's update as well the navigation from _pageB_ to _loginPage_.

_./src/pages/b/pageB.tsx_

```diff
import * as React from "react"
import { Link } from 'react-router-dom';

export const PageB = () => {
  return (
    <div>
      <h2>Hello from page B</h2>
      <br />
-      <Link to="/">Navigate to Page A</Link>
+      <Link to="/">Navigate to Login</Link>
    </div>
  )
}
```

- Let's make a quick test and check that everything is still working fine.

```
npm start
```

- Time to remove 'Sample app' text from the main _html_.

_./src/index.html_

```diff
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title></title>
  </head>
  <body>
    <div class="well">
-      <h1>Sample app</h1>
      <div id="root"></div>
    </div>
  </body>
</html>
```

- Let's build a proper _login_ layout, _loginPage.tsx_. To build a nice layout, we will install _@material-ui/core_ and _@material-ui/icons_

```bash
npm install @material-ui/core @material-ui/icons --save
```

- However, we must be careful with the compatibility of certain versions of _typescript_ with the new _hooks_ of _material-ui_. For this example, we can install _typescript@3.3.3_ version. You can get more information about this issue in the following link https://github.com/mui-org/material-ui/issues/14018

- Now we could create a login form it could look something like:

_./src/pages/login.container.tsx_

```javascript
import * as React from "react";
import { withRouter, RouteComponentProps } from "react-router-dom";
import makeStyles from "@material-ui/styles/makeStyles";
import createStyles from "@material-ui/styles/createStyles";
import Card from "@material-ui/core/Card";
import CardHeader from "@material-ui/core/CardHeader";
import CardContent from "@material-ui/core/CardContent";
import TextField from "@material-ui/core/TextField";
import Button from "@material-ui/core/Button";

// https://material-ui.com/styles/api/#makestyles-styles-options-hook
const useStyles = makeStyles(theme =>
  createStyles({
    card: {
      maxWidth: 400,
      margin: "0 auto"
    }
  })
);

interface Props extends RouteComponentProps {}

export const LoginContainer: React.FC<Props> = (props) => {
  const classes = useStyles();

  return (
    <Card className={classes.card}>
      <CardHeader title="Login" />
      <CardContent>
        <div
          style={{
            display: "flex",
            flexDirection: "column",
            justifyContent: "center"
          }}
        >
          <TextField label="Name" margin="normal" />
          <TextField label="Password" type="password" margin="normal" />
          <Button variant="contained" color="primary">
            Login
          </Button>
        </div>
      </CardContent>
    </Card>
  );
};
```

- This can be ok, but if we take a deeper look to this component, we could break down into two, one is the card itself the other the form dialog, so it should finally look like:

** Proposal **

```javascript
<Card className={classes.card}>
  <CardHeader title="Login" />
  <CardContent>
    <LoginForm />
  </CardContent>
</Card>
```

- Let's create the LoginForm component (append it to the loginPage file):

_./src/pages/login.component.tsx_

```javascript
export const LoginComponent: React.FC<PropsForm> = (props) => {
  return (
    <div
      style={{
        display: "flex",
        flexDirection: "column",
        justifyContent: "center"
      }}
    >
      <TextField
        label="Name"
        margin="normal"
      />
      <TextField
        label="Password"
        type="password"
        margin="normal"
      />
      <Button
        variant="contained"
        color="primary"
      >
        Login
      </Button>
    </div>
  );
};
```

- And let's update the _login.container.tsx_

_./src/pages/login.container.tsx_

```diff
  return (
    <Card className={classes.card}>
      <CardHeader title="Login" />
      <CardContent>
+        <LoginComponent/>
-        <div style={{ display: 'flex', flexDirection: 'column', justifyContent: 'center' }}>
-          <TextField
-            label="Name"
-            margin="normal"
-          />
-          <TextField
-            label="Password"
-            type="password"
-            margin="normal"
-          />
-          <Button variant="contained" color="primary">
-            Login
-          </Button>
-        </div>
      </CardContent>
    </Card>
  )
```

- Let's give a try and check how is it looking.

```bash
npm start
```

- Let's add the navigation on button clicked, we will do it in two steps.

- First we will expose a method to do that in the loginPage.

_./src/pages/login/login.container.tsx_

```diff
// ...

// https://material-ui.com/styles/api/#makestyles-styles-options-hook
const useStyles = makeStyles(theme =>
  createStyles({
    card: {
      maxWidth: 400,
      margin: "0 auto"
    }
  })
);

interface Props extends RouteComponentProps {}

export const LoginContainer: React.FC<Props> = (props) => {
  const { classes } = props;

+   const onLogin = () => {
+      props.history.push('/pageB');
+   }

  return (
    <Card className={classes.card}>
      <CardHeader title="Login" />
      <CardContent>
-        <LoginForm/>
+        <LoginForm onLogin={onLogin}/>
      </CardContent>
    </Card>
  )
}

```

- Let's add the navigation on button clicked (later on we will check for user and pwd) _form.tsx_.
  In order to do this we have used react-router 4 "withRouter" HoC (High order component), and pass it
  down to the LoginForm component.

_./src/pages/login.component.tsx_

```diff
+interface PropsForm {
+  onLogin : () => void;
+}
-const LoginForm = props => {
+const LoginForm = (props : PropsForm) => {
+   const { onLogin } = props;
    return (
      <div
        style={{
          display: "flex",
          flexDirection: "column",
          justifyContent: "center"
        }}
      >
        <TextField label="Name" margin="normal" />
        <TextField label="Password" type="password" margin="normal" />
-       <Button variant="contained" color="primary">
+       <Button variant="contained" color="primary" onClick={onLogin}>
          Login
        </Button>
      </div>
    );
  };
```

- Let's give a quick try.

```bash
npm start
```

Ok, we can navigate whenever we click on the login page.

- Let's keep on progressing, now it is time to collect the username and password info, and check if password is valid or not.

- Let's define an entity for the loginInfo. Let's create the following path and file

_src/model/login.ts_

```javascript
export interface LoginEntity {
  login: string;
  password: string;
}

export const createEmptyLogin = (): LoginEntity => ({
  login: "",
  password: ""
});
```

- Let's add login validation fake restApi: create a folder _src/api_ and a file called _login.ts_

_./src/api/login.ts_

```javascript
import { LoginEntity } from "../model/login";

// Just a fake loginAPI
export const isValidLogin = (loginInfo: LoginEntity): Promise<boolean> =>
  new Promise((resolve) => {
    setTimeout(() => {
      // mock call
      resolve(loginInfo.login === "admin" && loginInfo.password === "test");
    }, 500);
  });
```

- Let's add the _api_ integration, plus navigation on login succeeded:

- First let's create a login state and add the api integration.

_./src/pages/login.container.tsx_

```diff
+ import { LoginEntity, createEmptyLogin } from '../model/login';
+ import { isValidLogin } from '../api/login';
```

_./src/pages/login.container.tsx_

```diff
const LoginPageInner = (props: Props) => {
+  const [loginInfo, setLoginInfo] = React.useState<LoginEntity>(
+   createEmptyLogin()
+  );
  const { classes } = props;

  const loginSucceeded = (isValid: boolean) => {
    if (isValid) {
      history.push("/pageB");
    } else {
      setShowAlert(true);
    }
  };
  
  const handleLogin = (login: LoginEntity) => {
    isValidLogin(login).then(loginSucceeded);
  };

```

- Now let's read the data from the textfields components (user and password).

_./src/pages/login.container.tsx_

```diff
  return (
    <Card className={classes.card}>
      <CardHeader title="Login" />
      <CardContent>
+        <LoginForm onLogin={handleLogin}/>
      </CardContent>
    </Card>
  );
```

- And update _LoginForm_ props and textField onChange.

_./src/pages/login.component.tsx_

```diff
interface PropsForm {
+  onLogin: (login: LoginEntity) => void;
}

export const LoginComponent: React.FC<PropsForm> = (props) => {
+  const [loginInfo, setLoginInfo] = React.useState<LoginEntity>(
+  const { onLogin } = props;
+    createEmptyLogin()
+  );
+  const classes = useFormStyles();
+  const onTexFieldChange = (fieldId) => (e) => {
+    setLoginInfo({
+      ...loginInfo,
+      [fieldId]: e.target.value,
+    });
+  };

  return (
    <div
      style={{
        display: "flex",
        flexDirection: "column",
        justifyContent: "center"
      }}
    >
      <TextField
        label="Name"
        margin="normal"
+        value={loginInfo.login}
+        onChange={onTexFieldChange("login")}
      />
      <TextField
        label="Password"
        type="password"
        margin="normal"
+        value={loginInfo.password}
+        onChange={onTexFieldChange("password")}
      />
      <Button
        variant="contained"
        color="primary"
        onClick={() => onLogin(loginInfo)}
      >
        Login
      </Button>
    </div>
  );
};
```

- We will add material-ui classes to LoginForm component.

_./src/pages/login.container.tsx_

```diff
interface PropsForm {
  onLogin: (login: LoginEntity) => void;
}

+ // https://material-ui.com/styles/api/#makestyles-styles-options-hook
+ const useFormStyles = makeStyles(theme =>
+   createStyles({
+     formContainer: {
+       display: "flex",
+       flexDirection: "column",
+       justifyContent: "center"
+     }
+   })
+ );

export const LoginComponent: React.FC<PropsForm> = (props) => {
+ const classes = useFormStyles();

  return (
-   <div
-     style={{
-       display: "flex",
-       flexDirection: "column",
-       justifyContent: "center"
-     }}
-   >
+   <div className={classes.formContainer}>
      <TextField label="Name" margin="normal"
        value={loginInfo.login}
        onChange={onTexFieldChange('login')}
      />
      <TextField label="Password" type="password" margin="normal"
        value={loginInfo.password}
        onChange={onTexFieldChange('password')}
      />
      <Button variant="contained" color="primary" onClick={onLogin}>
        Login
      </Button>
    </div>
  );
};
```

- Let's display a notification when the login validation fails.

- First we will create a simple notification component, base on _react material ui_ _snackbar_

_./src/common/notification.tsx_

```javascript
import * as React from "react";
import Snackbar from "@material-ui/core/Snackbar";
import IconButton from "@material-ui/core/IconButton";
import CloseIcon from "@material-ui/icons/Close";
import createStyles from "@material-ui/core/styles/createStyles";
import makeStyles from "@material-ui/core/styles/makeStyles";

interface Props {
  message: string;
  show: boolean;
  onClose: () => void;
}

const useStyles = makeStyles(theme =>
  createStyles({
    close: {
      padding: theme.spacing(0.5)
    }
  })
);

export const NotificationComponent = (props: Props) => {
  const { message, show, onClose } = props;
  const classes = useStyles();

  return (
    <Snackbar
      anchorOrigin={{
        vertical: "bottom",
        horizontal: "left"
      }}
      open={show}
      autoHideDuration={3000}
      onClose={onClose}
      ContentProps={{
        "aria-describedby": "message-id"
      }}
      message={<span id="message-id">{message}</span>}
      action={[
        <IconButton
          key="close"
          aria-label="Close"
          color="inherit"
          className={classes.close}
          onClick={onClose}
        >
          <CloseIcon />
        </IconButton>
      ]}
    />
  );
};
```

- Let's expose this common component via an _index_ file.

_./src/common/index.ts_

```javascript
export * from "./notification";
```

- Now let's instantiate this in our _loginPage_

_./src/pages/login.container.tsx_

```diff
+ import { NotificationComponent } from "../common";

// (...)

const LoginPageInner = (props: Props) => {
  const [loginInfo, setLoginInfo] = React.useState<LoginEntity>(
    createEmptyLogin()
  );
+ const [isShowAlert, setShowAlert] = React.useState(false);
  const classes = useStyles();

  const onLogin = () => {
    if (isValidLogin(loginInfo)) {
      props.history.push("/pageB");
-    }
+    } else {
+      setShowAlert(true);
+    }
  }

  const onUpdateLoginField = (name, value) => {
    setLoginInfo({
      ...loginInfo,
      [name]: value
    });
  };

  return (
+   <>
    <Card className={classes.card}>
      <CardHeader title="Login" />
      <CardContent>
        <LoginForm
          onLogin={onLogin}
          onUpdateField={onUpdateLoginField}
          loginInfo={loginInfo}
        />
      </CardContent>
    </Card>
+     <NotificationComponent
+       message="Invalid login or password, please type again"
+       show={isShowAlert}
+       onClose={() => setShowAlert(false)}
+     />
+   </>
  );
};
```

# Example 14 Form Validation With React 

Let's add validation support to this form.

For this we will use formik, fonk and fonk-formik library

Summary steps:

- Install formik, fonk, fonk-formik library.
- Refactor input component to a common component and include error validation info.
- Let's define the validation for the form.
- Let's hook it.

## Steps

- Copy the content from _13 LoginForm_ and execute `npm install`.

```bash
npm install
```

- Let's install the _formik, @lemoncode/fonk, @lemoncode/fonk-formik _.

```bash
npm install formik @lemoncode/fonk @lemoncode/fonk-formik --save
```

- To avoid having too much repeated code let's move to common an input component, including it's
  label plus validation text.

_./common/textField.component.tsx_

```tsx
import * as React from "react";
import { useField } from "formik";
import MuiTextField, { TextFieldProps } from "@material-ui/core/TextField";

export const TextFieldComponent: React.FC<TextFieldProps> = (props) => {
  const [field, meta] = useField(props.name);
  const textFieldProps = Boolean(field) ? field : props;
  const hasError = Boolean(meta && meta.touched && meta.error);

  return (
    <>
      <MuiTextField
        {...props}
        name={textFieldProps.name}
        onChange={textFieldProps.onChange}
        onBlur={textFieldProps.onBlur}
        value={textFieldProps.value}
        error={hasError}
        helperText={hasError ? meta.error : ""}
        fullWidth={true}
        margin="normal"
      />
    </>
  );
};
```

- Let's add it to the common index file.

_./src/common/index.ts_

```diff
export * from './notification';
+ export * from './TextFieldComponent';
```

- Now let's define a basic validation for the form, we want to ensure both fields are informed.

_./src/pages/login.validation.ts_

```typescript
import { ValidationSchema, Validators } from "@lemoncode/fonk";
import { createFormikValidation } from "@lemoncode/fonk-formik";

const validationSchema: ValidationSchema = {
  field: {
    login: [Validators.required],
    password: [Validators.required],
  },
};

export const loginFormValidation = createFormikValidation(validationSchema);
```

- Now let's go for the component side.

- First let's add the dataFormErrors to the state of the component.

_./src/pages/login.container.tsx_

```diff
import { isValidLogin } from "../api/login";
import { NotificationComponent } from "../common";
```


- Let's fire the validation on viewmodel update and replace the _TextFieldForm_ entries with the wrapper we have created (includes
  displaying validation errors).

_./src/pages/login.component.tsx_

```diff
+ import { loginFormValidation } from "./login.validation";
+ import { TextFieldComponent } from '../common';

+<Formik
+      onSubmit={onLogin}
+      initialValues={createEmptyLogin()}
+      validate={loginFormValidation.validateForm}
+    >
+      {() => (
+        <Form>
+          <div className={classes.formContainer}>
-             <TextField
+             <TextFieldComponent
               label="Name"
+               name="login"
-               margin="normal"
-               value={loginInfo.login}
-               onChange={onTexFieldChange("login")}
               />
-             <TextField
+             <TextFieldComponent
               label="Password"
+               name="password"
               type="password"
-               margin="normal"
-               value={loginInfo.password}
-               onChange={onTexFieldChange("password")}
+          />
+      </div>
+    </Form>
+  )}
+</Formik>
```

- Let's give a try

```bash
npm start
```


# Example 15 Context usage React Context API (Optional)  

In this sample we are going to learn how React 16 context api works.

This will allow us to share information between components without having to go through props drilldown or having to add redux support to our project.

We will take a startup point sample 14 FormValidation:

## Steps

- We want to store just the _login_ field once the user logs in and display it in the page B (or in whatever page or component we need it), let's add a default value ('no user').

- Let's start by creating a context, we will call it _sessionContext_, and add the proper typing

_./src/common/sessionContext.tsx_

```javascript
import * as React from "react";

export interface SessionContextProps {
  login: string;
  updateLogin: (value: string) => void;
}

export const createDefaultUser = (): SessionContextProps => ({
  login: "no user",
  updateLogin: value => {
    console.warn(
      "if you are reading this, likely you forgot to add the provider on top of your app"
    );
  }
});

export const SessionContext =
  React.createContext < SessionContextProps > createDefaultUser();
```

- This session context will expose a _provider_ (it will serve us to set the login name in the context), and a _consumer_ (that will let us consume the login name from the context at any point of the application).
  We will create a component (we will name it _SessionProvider_) that on one hand will store in the state the login name and bind it to the _SessionContext_ and on the other hand it will act as a wrapper (usually it will sit on top of the application and wrap the application).

_./src/common/sessionContext.tsx_

Append this at the bottom of the file.

```typescript
export const SessionProvider: React.StatelessComponent = props => {
  const [login, setLogin] = React.useState<string>("");

  return (
    <SessionContext.Provider value={{ login, updateLogin: setLogin }}>
      {props.children}
    </SessionContext.Provider>
  );
};
```

- Let's import the _SessionProvider_ in the barrel _index_.

_./src/common/index.ts_

```diff
export * from "./notification";
export * from "./textFieldForm";
+ export * from "./sessionContext";
```

- Let's setup the _sessionProvider_ at the top of our application.

_./src/app.tsx_

```diff
import * as React from "react";
import { HashRouter, Switch, Route } from "react-router-dom";
import { LoginPage } from "./pages/loginPage";
import { PageB } from "./pages/pageB";
+ import { SessionProvider } from "./common";

export const App = () => {
  return (
    <>
+      <SessionProvider>
        <HashRouter>
          <Switch>
            <Route exact={true} path="/" component={LoginPage} />
            <Route path="/pageB" component={PageB} />
          </Switch>
        </HashRouter>
+      </SessionProvider>
    </>
  );
};

```

- Let's access the context in PageB using the _useContext_.

_./src/pages/pageB.tsx_

```diff
import * as React from "react";
import { Link } from "react-router-dom";
+ import { SessionContext } from '../common';

- export const PageB = () => (
+ export const PageB = () => {
+
+ const loginContext = React.useContext(SessionContext);
+
+ return (
  <div>
    <h2>Hello from page B</h2>
+   <h3>User logged in: {loginContext.login}</h3>
    <br />
    <Link to="/">Navigate to Login</Link>
  </div>
+ )
+}
```

- Let's update the loginPage.

_./src/pages/login.container.tsx_

```diff
- import { TextFieldForm } from "../common";
+ import { TextFieldForm, SessionContext } from "../common";

```

_./src/pages/loginPage.tsx_

```diff
export const LoginContainer: React.FC<Props> = (props) => {
+  const loginContext = React.useContext(SessionContext);
  const history = useHistory();
  const [isShowAlert, setShowAlert] = React.useState(false);
  const classes = useFormStyles();

  const loginSucceeded = (isValid: boolean, login: LoginEntity) => {
    if (isValid) {
      history.push("/pageB");
+      loginContext.updateLogin(login.login);
    } else {
      setShowAlert(true);
    }
  };

  const handleLogin = (login: LoginEntity) => {
    isValidLogin(login).then((isValid) => loginSucceeded(isValid, login));
  };
};
```
> # **Redux** 

## Redux Basics

Now that you know what Redux is, let's briefly look at the pieces that make up a Redux app and how it works.


The rest of the description on this page focuses solely on the Redux core library (the `redux` package). We'll talk about the other Redux-related packages as we go through the rest of the tutorial.

:::

### The Redux Store

The center of every Redux application is the **store**. A "store" is a container that holds your application's global **state**.

A store is a JavaScript object with a few special functions and abilities that make it different than a plain global object:

- You must never directly modify or change the state that is kept inside the Redux store
- Instead, the only way to cause an update to the state is to create a plain **action** object that describes "something that happened in the application", and then **dispatch** the action to the store to tell it what happened.
- When an action is dispatched, the store runs the root **reducer** function, and lets it calculate the new state based on the old state and the action
- Finally, the store notifies **subscribers** that the state has been updated so the UI can be updated with the new data.

### Redux Core Example App

Let's look at a minimal working example of a Redux app - a small counter application:

Because Redux is a standalone JS library with no dependencies, this example is written by only loading a single script tag for the Redux library, and uses basic JS and HTML for the UI. In practice, Redux is normally used by [installing the Redux packages from NPM](../../introduction/Installation.md), and the UI is created using a library like [React](https://reactjs.org).

:::info

[Part 5: UI and React](./part-5-ui-and-react.md) shows how to use Redux and React together.

:::

Let's break this example down into its separate parts to see what's happening.

#### State, Actions, and Reducers

We start by defining an initial **state** value to describe the application:

```js
// Define an initial state value for the app
const initialState = {
  value: 0
}
```

For this app, we're going to track a single number with the current value of our counter.

Redux apps normally have a JS object as the root piece of the state, with other values inside that object.

Then, we define a **reducer** function. The reducer receives two arguments, the current `state` and an
`action` object describing what happened. When the Redux app starts up, we don't have any state yet,
so we provide the `initialState` as the default value for this reducer:

```js
// Create a "reducer" function that determines what the new state
// should be when something happens in the app
function counterReducer(state = initialState, action) {
  // Reducers usually look at the type of action that happened
  // to decide how to update the state
  switch (action.type) {
    case 'counter/incremented':
      return { ...state, value: state.value + 1 }
    case 'counter/decremented':
      return { ...state, value: state.value - 1 }
    default:
      // If the reducer doesn't care about this action type,
      // return the existing state unchanged
      return state
  }
}
```

Action objects always have a `type` field, which is a string you provide that
acts as a unique name for the action. The `type` should be a readable name so that
anyone who looks at this code understands what it means. In this case, we use the
word 'counter' as the first half of our action type, and the second half is a
description of "what happened". In this case, our 'counter' was 'incremented', so
we write the action type as `'counter/incremented'`.

Based on the type of the action, we either need to return a brand-new object to
be the new `state` result, or return the existing `state` object if nothing should change.
Note that we update the state _immutably_ by copying the existing state and updating the
copy, instead of modifying the original object directly.

#### Store

Now that we have a reducer function, we can create a **store** instance by
calling the Redux library `createStore` API.

```js
// Create a new Redux store with the `createStore` function,
// and use the `counterReducer` for the update logic
const store = Redux.createStore(counterReducer)
```

We pass the reducer function to `createStore`, which uses the reducer function
to generate the initial state, and to calculate any future updates.

#### UI

In any application, the user interface will show existing state on screen. When a user
does something, the app will update its data and then redraw the UI with those values.

```js
// Our "user interface" is some text in a single HTML element
const valueEl = document.getElementById('value')

// Whenever the store state changes, update the UI by
// reading the latest store state and showing new data
function render() {
  const state = store.getState()
  valueEl.innerHTML = state.value.toString()
}

// Update the UI with the initial data
render()
// And subscribe to redraw whenever the data changes in the future
store.subscribe(render)
```

In this small example, we're only using some basic HTML elements as our UI,
with a single `<div>` showing the current value.

So, we write a function that knows how to get the latest state from the Redux
store using the `store.getState()` method, then takes that value and updates the UI to show it.

The Redux store lets us call `store.subscribe()` and pass a subscriber callback function that will be called
every time the store is updated. So, we can pass our `render` function as the subscriber, and know that
each time the store updates, we can update the UI with the latest value.

Redux itself is a standalone library that can be used anywhere. This also means that it can be used with any UI layer.

#### Dispatching Actions

Finally, we need to respond to user input by creating **action** objects that
describe what happened, and **dispatching** them to the store. When we call `store.dispatch(action)`,
the store runs the reducer, calculates the updated state, and runs the subscribers
to update the UI.

```js
// Handle user inputs by "dispatching" action objects,
// which should describe "what happened" in the app
document.getElementById('increment').addEventListener('click', function () {
  store.dispatch({ type: 'counter/incremented' })
})

document.getElementById('decrement').addEventListener('click', function () {
  store.dispatch({ type: 'counter/decremented' })
})

document
  .getElementById('incrementIfOdd')
  .addEventListener('click', function () {
    // We can write logic to decide what to do based on the state
    if (store.getState().value % 2 !== 0) {
      store.dispatch({ type: 'counter/incremented' })
    }
  })

document
  .getElementById('incrementAsync')
  .addEventListener('click', function () {
    // We can also write async logic that interacts with the store
    setTimeout(function () {
      store.dispatch({ type: 'counter/incremented' })
    }, 1000)
  })
```

Here, we'll dispatch the actions that will make the reducer add 1 or
subtract 1 from the current counter value.

We can also write code that only dispatches an action if a certain
condition is true, or write some async code that dispatches an action
after a delay.

### Data Flow

We can summarize the flow of data through a Redux app with this diagram. It represents how:

- actions are dispatched in response to a user interaction like a click
- the store runs the reducer function to calculate a new state
- the UI reads the new state to display the new values

