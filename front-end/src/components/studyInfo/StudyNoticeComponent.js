import React, {Component, useRef} from 'react';

// markdown editor
import Prism from 'prismjs';
import '@toast-ui/editor/dist/toastui-editor.css';
import { Editor } from '@toast-ui/react-editor';
import '@toast-ui/editor-plugin-code-syntax-highlight/dist/toastui-editor-plugin-code-syntax-highlight.css';
import codeSyntaxHighlight from '@toast-ui/editor-plugin-code-syntax-highlight';

// markdown viewer
import '@toast-ui/editor/dist/toastui-editor.css';
import { Viewer } from '@toast-ui/react-editor';
import '@toast-ui/editor-plugin-code-syntax-highlight/dist/toastui-editor-plugin-code-syntax-highlight.css';

// css
import './StudyNoticeStyle.css'

let notice = `
### [필독] 스터디 활동 규칙
여러분께서 스터디에서 활동하면서 지켜야할 규칙이 총 3가지가 있습니다.

Rule1

Rule2

Rule3

위의 3가지 룰을 어길 시, 경고를 드릴 겁니다.
만약, 3번 이상의 경고를 받는다면 퇴장 조치를 내릴겁니다.
Rule1

Rule2

Rule3

위의 3가지 룰을 어길 시, 경고를 드릴 겁니다.
만약, 3번 이상의 경고를 받는다면 퇴장 조치를 내릴겁니다.Rule1

Rule2

Rule3

위의 3가지 룰을 어길 시, 경고를 드릴 겁니다.
만약, 3번 이상의 경고를 받는다면 퇴장 조치를 내릴겁니다.Rule1

Rule2

Rule3

위의 3가지 룰을 어길 시, 경고를 드릴 겁니다.
만약, 3번 이상의 경고를 받는다면 퇴장 조치를 내릴겁니다.Rule1

Rule2

Rule3

위의 3가지 룰을 어길 시, 경고를 드릴 겁니다.
만약, 3번 이상의 경고를 받는다면 퇴장 조치를 내릴겁니다.

잘 숙지해주시고, 활발한 스터디 활동을 해주셨음 합니다.😊
`;

/* 수정중...ㅎ */
function StudyNoticeComponent() {
	// constructor(props) {
	// 	super(props);
	// 	this.state = {
	// 		isEditorDisplay: false,
	// 	};
	// 	this.editorRef = useRef();
	// 	
	// 	this.handleClick = this.handleClick.bind(this);
	// 	this.handleModify = this.handleModify.bind(this);
	// }
	let isEditorDisplay = false;
	let editorRef = useRef();

	console.log(editorRef.current);

	function handleClick() {
		isEditorDisplay = !isEditorDisplay;

		// this.setState(state => ({
		// 	isEditorDisplay: !state.isEditorDisplay
		// }));
	}

	function handleModify() {
		const editorInstance = editorRef.current;
		const getMarkdown = editorInstance.getMarkdown();
		
		this.handleClick();

		console.log(getMarkdown);

		notice = getMarkdown;
	}

	// render() {
		return(
			//  아직 editor, viewer 간의 연결 X
			<div className='notice-part'>
				<div className='markdown-editor' style={{display: isEditorDisplay ? "block" : "none"} } >
					<Editor 
						height='100%'
						hideModeSwitch='true'
						ref={editorRef}
						placeholder='스터디 정보, 공지 등 스터디를 진행하기 위해 스터디원들이 알아야할 내용을 적어주세요.'
						plugins={[[codeSyntaxHighlight, { highlighter: Prism }]]}/>

					<span className='modify-btn' onClick={handleModify()}>수정하기</span>
				</div>
				<div className='markdown-viewer' style={{display: isEditorDisplay ? "none" : "block"}}>
					<Viewer
						initialValue={notice}
						plugins={[[codeSyntaxHighlight, { highlighter: Prism }]]} />
					<span className='modify-btn' onClick={handleClick()}>수정하기</span>
				</div>
			</div>
		)
	// }
}

export default StudyNoticeComponent;


