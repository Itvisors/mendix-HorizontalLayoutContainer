/**
 * This file was generated from HorizontalLayoutContainer.xml
 * WARNING: All changes made to this file will be overwritten
 * @author Mendix Widgets Framework Team
 */
import { ComponentType, CSSProperties, ReactNode } from "react";
import { ListValue, ListWidgetValue } from "mendix";

export interface ContentListType {
    content: ListWidgetValue;
}

export interface ContentListPreviewType {
    content: { widgetCount: number; renderer: ComponentType<{ children: ReactNode; caption?: string }> };
}

export interface HorizontalLayoutContainerContainerProps {
    name: string;
    class: string;
    style?: CSSProperties;
    tabIndex?: number;
    ds: ListValue;
    contentList: ContentListType[];
}

export interface HorizontalLayoutContainerPreviewProps {
    /**
     * @deprecated Deprecated since version 9.18.0. Please use class property instead.
     */
    className: string;
    class: string;
    style: string;
    styleObject?: CSSProperties;
    readOnly: boolean;
    renderMode: "design" | "xray" | "structure";
    translate: (text: string) => string;
    ds: {} | { caption: string } | { type: string } | null;
    contentList: ContentListPreviewType[];
}
