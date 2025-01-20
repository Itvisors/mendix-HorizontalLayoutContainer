import { ReactElement, createElement } from "react";
import { HorizontalLayout } from "./components/HorizontalLayout";

import { HorizontalLayoutContainerContainerProps } from "../typings/HorizontalLayoutContainerProps";

import "./ui/HorizontalLayoutContainer.css";

export function HorizontalLayoutContainer(props: HorizontalLayoutContainerContainerProps): ReactElement {
    const { ds, name } = props;
    if (!ds || !ds.items) {
        return <div className={name}></div>;
    }
    return <HorizontalLayout dsItems={ds.items} contentList={props.contentList} widgetName={props.name} widgetClass={props.class} />;
}
