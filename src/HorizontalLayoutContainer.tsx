import { ReactElement, createElement } from "react";
import { HelloWorldSample } from "./components/HelloWorldSample";

import { HorizontalLayoutContainerContainerProps } from "../typings/HorizontalLayoutContainerProps";

import "./ui/HorizontalLayoutContainer.css";

export function HorizontalLayoutContainer({ sampleText }: HorizontalLayoutContainerContainerProps): ReactElement {
    return <HelloWorldSample sampleText={sampleText ? sampleText : "World"} />;
}
