import { ReactElement, createElement } from "react";
import { HelloWorldSample } from "./components/HelloWorldSample";
import { HorizontalLayoutContainerPreviewProps } from "../typings/HorizontalLayoutContainerProps";

export function preview({ sampleText }: HorizontalLayoutContainerPreviewProps): ReactElement {
    return <HelloWorldSample sampleText={sampleText} />;
}

export function getPreviewCss(): string {
    return require("./ui/HorizontalLayoutContainer.css");
}
